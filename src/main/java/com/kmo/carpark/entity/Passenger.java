package com.kmo.carpark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_cars")
public class PassangerCar extends Vehicle{

    @Column(name = "count_of_axles")
    private int countOfAxles;

    @Column(name = "count_of_passengers")
    private int countOfPassengers;

    public PassangerCar() {
    }

    public PassangerCar(String carBrand, String carModel, String carCategory, String stateNumber, String carType, String yearOfProduction, boolean hasTrailer, int countOfAxles, int countOfPassagners) {
        super(carBrand, carModel, carCategory, stateNumber, carType, yearOfProduction, hasTrailer);
        this.countOfAxles = countOfAxles;
        this.countOfPassengers = countOfPassagners;
    }

    public int getCountOfAxles() {
        return countOfAxles;
    }

    public void setCountOfAxles(int countOfAxles) {
        this.countOfAxles = countOfAxles;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassagners) {
        this.countOfPassengers = countOfPassagners;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "countOfAxles=" + countOfAxles +
                ", countOfPassengers=" + countOfPassengers +
                '}';
    }
}
