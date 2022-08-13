package com.example.homeassistantbackend.device;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @GetMapping("/api/device")
    public List<DeviceDTO> listDevices() {
        return IterableUtils.toList(deviceRepository.findAll()).stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping("/api/device")
    public DeviceDTO create(@RequestBody DeviceDTO deviceDTO) {
        return toDTO(deviceRepository.save(toDomain(deviceDTO)));
    }

    @DeleteMapping("/api/device/{id}")
    public boolean delete(@PathVariable("id") long id) {
        deviceRepository.deleteById(id);
        return true;
    }

    private DeviceDTO toDTO(Device device) {
        return new DeviceDTO(device.getId(), device.getName(), device.getType(), device.getDescription());
    }

    private Device toDomain(DeviceDTO deviceDTO) {
        return new Device(deviceDTO.getId(), deviceDTO.getName(), deviceDTO.getType(), deviceDTO.getDescription());
    }
}
