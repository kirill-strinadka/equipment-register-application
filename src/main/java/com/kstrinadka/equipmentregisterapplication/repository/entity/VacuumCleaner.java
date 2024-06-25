package com.kstrinadka.equipmentregisterapplication.repository.entity;

import jakarta.persistence.Entity;

@Entity
public class VacuumCleaner extends DeviceModel {
    private String dustCollectorVolume;
    private int modesCount;
}
