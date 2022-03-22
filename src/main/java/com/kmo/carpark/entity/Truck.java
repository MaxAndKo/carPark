package com.kmo.carpark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trucks")
public class Truck extends Vehicle{

    @Column(name = "load_capacity")
    private int loadCapacity;

    @Column(name = "is_body_closed")
    private boolean isBodyClosed;

    public Truck() {
    }

    public Truck(String carBrand, String carModel, String carCategory, String stateNumber, String carType, String yearOfProduction, boolean hasTrailer, int loadCapacity, boolean isBodyClosed) {
        super(carBrand, carModel, carCategory, stateNumber, carType, yearOfProduction, hasTrailer);
        this.loadCapacity = loadCapacity;
        this.isBodyClosed = isBodyClosed;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean getIsBodyClosed() {
        return isBodyClosed;
    }

    public void setIsBodyClosed(boolean bodyClosed) {
        isBodyClosed = bodyClosed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", isBodyClosed=" + isBodyClosed +
                '}';
    }
}
