package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public abstract class DeviceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String serialNumber;
    private String color;
    private String size;
    private BigDecimal price;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "device_type_id")
    private DeviceType deviceType;

    // Getters and setters
}

