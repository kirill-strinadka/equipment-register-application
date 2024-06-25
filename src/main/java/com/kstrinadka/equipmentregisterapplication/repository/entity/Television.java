package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.Entity;

@Entity
public class Television extends DeviceModel {
    private String category;
    private String technology;
}
