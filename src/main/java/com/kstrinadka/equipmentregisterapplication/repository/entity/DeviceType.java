package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DeviceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String countryOfOrigin;
    private String manufacturer;
    private boolean onlineOrder;
    private boolean installment;

    @OneToMany(mappedBy = "deviceType", cascade = CascadeType.ALL)
    private List<DeviceModel> models;

    // Getters and setters
}

