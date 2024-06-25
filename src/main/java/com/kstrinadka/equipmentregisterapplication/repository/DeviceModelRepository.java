package com.kstrinadka.equipmentregisterapplication.repository;

import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceModel;
import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface DeviceModelRepository extends JpaRepository<DeviceModel, Long> {
    List<DeviceModel> findByDeviceTypeAndColorAndPriceBetween(
            DeviceType deviceType, String color, BigDecimal priceFrom, BigDecimal priceTo
    );

}