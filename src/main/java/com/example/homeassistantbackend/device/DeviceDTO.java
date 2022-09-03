package com.example.homeassistantbackend.device;

import lombok.*;
import org.springframework.lang.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class DeviceDTO {
    @Nullable
    private long id;
    private String name;
    private String type;
    @Nullable
    private String description;
}
