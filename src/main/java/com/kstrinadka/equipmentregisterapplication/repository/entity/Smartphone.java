package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.Entity;

@Entity
public class Smartphone extends DeviceModel {
    private String memory;
    private int camerasCount;
}