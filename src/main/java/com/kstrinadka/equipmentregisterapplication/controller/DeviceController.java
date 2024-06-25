package com.kstrinadka.equipmentregisterapplication.controller;

import com.kstrinadka.equipmentregisterapplication.repository.DeviceTypeRepository;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceModel;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceType;
import com.kstrinadka.equipmentregisterapplication.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/devices")
@RequiredArgsConstructor
public class DeviceController {

    private final DeviceService deviceService;
    private final DeviceTypeRepository deviceTypeRepository;

    @GetMapping("/search")
    public List<DeviceType> searchDeviceTypes(@RequestParam String name) {
        return deviceService.searchDeviceTypes(name);
    }

    @GetMapping("/filter")
    public List<DeviceModel> filterDevices(@RequestParam Long typeId,
                                           @RequestParam String color,
                                           @RequestParam BigDecimal priceFrom,
                                           @RequestParam BigDecimal priceTo) {
        DeviceType deviceType = deviceTypeRepository.findById(typeId).orElseThrow();
        return deviceService.filterDevices(deviceType, color, priceFrom, priceTo);
    }

    @GetMapping("/sort/name")
    public List<DeviceType> sortDeviceTypesByName() {
        return deviceService.sortDeviceTypesByName();
    }

    @GetMapping("/sort/price")
    public List<DeviceType> sortDeviceTypesByPrice() {
        return deviceService.sortDeviceTypesByPrice();
    }

    @PostMapping
    public DeviceType addDeviceType(@RequestBody DeviceType deviceType) {
        return deviceService.addDeviceType(deviceType);
    }

    @PostMapping("/model")
    public DeviceModel addDeviceModel(@RequestBody DeviceModel deviceModel) {
        return deviceService.addDeviceModel(deviceModel);
    }
}

