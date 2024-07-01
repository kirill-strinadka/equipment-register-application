package com.kstrinadka.equipmentregisterapplication.controller;

import com.kstrinadka.equipmentregisterapplication.repository.DeviceTypeRepository;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceModel;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceType;
import com.kstrinadka.equipmentregisterapplication.service.DeviceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/devices")
@RequiredArgsConstructor
@Tag(name = "Device Controller", description = "API for managing devices")
public class DeviceController {

    private final DeviceService deviceService;
    private final DeviceTypeRepository deviceTypeRepository;

    @GetMapping("/search")
    @Operation(summary = "Search Device Types", description = "Search device types by name (case-insensitive)")
    public List<DeviceType> searchDeviceTypes(@RequestParam @Parameter(description = "Name of the device type") String name) {
        return deviceService.searchDeviceTypes(name);
    }

    @GetMapping("/filter")
    @Operation(summary = "Filter Devices", description = "Filter devices by type, color, and price range")
    public List<DeviceModel> filterDevices(@RequestParam @Parameter(description = "Device type ID") Long typeId,
                                           @RequestParam @Parameter(description = "Color of the device") String color,
                                           @RequestParam @Parameter(description = "Minimum price") BigDecimal priceFrom,
                                           @RequestParam @Parameter(description = "Maximum price") BigDecimal priceTo) {
        DeviceType deviceType = deviceTypeRepository.findById(typeId).orElseThrow();
        return deviceService.filterDevices(deviceType, color, priceFrom, priceTo);
    }

    @GetMapping("/sort/name")
    @Operation(summary = "Sort Devices by Name", description = "Sort devices by name in alphabetical order")
    public List<DeviceType> sortDeviceTypesByName() {
        return deviceService.sortDeviceTypesByName();
    }

    @GetMapping("/sort/price")
    @Operation(summary = "Sort Devices by Price", description = "Sort devices by price")
    public List<DeviceType> sortDeviceTypesByPrice() {
        return deviceService.sortDeviceTypesByPrice();
    }

    @PostMapping
    @Operation(summary = "Add Device Type", description = "Add a new device type")
    public DeviceType addDeviceType(@RequestBody @Parameter(description = "Device type to be added") DeviceType deviceType) {
        return deviceService.addDeviceType(deviceType);
    }

    @PostMapping("/model")
    @Operation(summary = "Add Device Model", description = "Add a new device model")
    public DeviceModel addDeviceModel(@RequestBody @Parameter(description = "Device model to be added") DeviceModel deviceModel) {
        return deviceService.addDeviceModel(deviceModel);
    }
}

