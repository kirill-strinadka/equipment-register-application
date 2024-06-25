package com.kstrinadka.equipmentregisterapplication.service;

import com.kstrinadka.equipmentregisterapplication.repository.DeviceModelRepository;
import com.kstrinadka.equipmentregisterapplication.repository.DeviceTypeRepository;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceModel;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceTypeRepository deviceTypeRepository;

    @Autowired
    private DeviceModelRepository deviceModelRepository;

    public List<DeviceType> searchDeviceTypes(String name) {
        return deviceTypeRepository.findByNameContainingIgnoreCase(name);
    }

    public List<DeviceModel> filterDevices(DeviceType deviceType, String color, BigDecimal priceFrom, BigDecimal priceTo) {
        return deviceModelRepository.findByDeviceTypeAndColorAndPriceBetween(deviceType, color, priceFrom, priceTo);
    }

    public List<DeviceType> sortDeviceTypesByName() {
        return deviceTypeRepository.findAll(Sort.by("name"));
    }

    public List<DeviceType> sortDeviceTypesByPrice() {
        return deviceTypeRepository.findAll(Sort.by("price"));
    }

    public DeviceType addDeviceType(DeviceType deviceType) {
        return deviceTypeRepository.save(deviceType);
    }

    public DeviceModel addDeviceModel(DeviceModel deviceModel) {
        return deviceModelRepository.save(deviceModel);
    }
}

