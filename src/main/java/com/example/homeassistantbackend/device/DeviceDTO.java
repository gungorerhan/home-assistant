package com.example.homeassistantbackend.device;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@AllArgsConstructor
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

    public DeviceDTO(@Nullable long id, String name, String type, @Nullable String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }
}
