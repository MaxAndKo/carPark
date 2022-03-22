package com.kmo.carpark.entity;


import javax.persistence.*;

@Entity
@Table(name = "vehicles")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_category")
    private String carCategory;

    @Column(name = "state_number")
    private String stateNumber;

    @Column(name = "car_type")
    private String carType;

    @Column(name = "year_of_production")
    private String yearOfProduction;

    @Column(name = "has_trailer")
    private boolean hasTrailer;

    public Vehicle() {
    }

    public Vehicle(String carBrand, String carModel, String carCategory, String stateNumber, String carType, String yearOfProduction, boolean hasTrailer) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carCategory = carCategory;
        this.stateNumber = stateNumber;
        this.carType = carType;
        this.yearOfProduction = yearOfProduction;
        this.hasTrailer = hasTrailer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(String stateNumber) {
        this.stateNumber = stateNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carCategory='" + carCategory + '\'' +
                ", stateNumber='" + stateNumber + '\'' +
                ", carType='" + carType + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", hasTrailer=" + hasTrailer +
                '}';
    }
}
