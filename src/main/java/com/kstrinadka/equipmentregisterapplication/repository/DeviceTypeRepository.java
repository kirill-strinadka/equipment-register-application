package com.kstrinadka.equipmentregisterapplication.repository;

import com.kstrinadka.equipmentregisterapplication.repository.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceTypeRepository extends JpaRepository<DeviceType, Long> {
    List<DeviceType> findByNameContainingIgnoreCase(String name);
}
