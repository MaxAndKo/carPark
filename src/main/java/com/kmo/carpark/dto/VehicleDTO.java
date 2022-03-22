package com.kmo.carpark.dto;

import com.kmo.carpark.entity.Tractor;

public class VehicleDTO {

    private int id;

    private String carBrand;

    private String carModel;

    private String carCategory;

    private String stateNumber;

    private String carType;

    private String yearOfProduction;

    private boolean hasTrailer;

    private Integer loadCapacity = null;

    private Boolean isBodyClosed = null;

    private String trailerType = null;

    private Tractor.MoverEnum moverType = null;

    private Integer countOfAxles = null;

    private Integer countOfPassengers = null;

    public VehicleDTO() {
    }

    public VehicleDTO(int id, String carBrand, String carModel, String carCategory, String stateNumber, String carType,
                      String yearOfProduction, boolean hasTrailer, int loadCapacity, boolean isBodyClosed, String trailerType,
                      Tractor.MoverEnum moverType, int countOfAxles, int countOfPassengers) {
        this.id = id;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carCategory = carCategory;
        this.stateNumber = stateNumber;
        this.carType = carType;
        this.yearOfProduction = yearOfProduction;
        this.hasTrailer = hasTrailer;
        this.loadCapacity = loadCapacity;
        this.isBodyClosed = isBodyClosed;
        this.trailerType = trailerType;
        this.moverType = moverType;
        this.countOfAxles = countOfAxles;
        this.countOfPassengers = countOfPassengers;
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

    public Integer getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Integer loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Boolean getIsBodyClosed() {
        return isBodyClosed;
    }

    public void setBodyClosed(Boolean bodyClosed) {
        isBodyClosed = bodyClosed;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public Tractor.MoverEnum getMoverType() {
        return moverType;
    }

    public void setMoverType(Tractor.MoverEnum moverType) {
        this.moverType = moverType;
    }

    public Integer getCountOfAxles() {
        return countOfAxles;
    }

    public void setCountOfAxles(Integer countOfAxles) {
        this.countOfAxles = countOfAxles;
    }

    public Integer getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(Integer countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }
}
