package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.Entity;

@Entity
public class Refrigerator extends DeviceModel {
    private int doorsCount;
    private String compressorType;
}
