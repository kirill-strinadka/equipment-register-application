package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.Entity;

@Entity
public class Computer extends DeviceModel {
    private String category;
    private String processorType;
}
