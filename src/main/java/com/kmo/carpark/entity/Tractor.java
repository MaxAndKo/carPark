package com.kmo.carpark.entity;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "tractors")
public class Tractor extends Vehicle{

    public static enum MoverEnum {
        КОЛЕСА,
        ГУСЕНИЦЫ;

        MoverEnum() {
        }
    }

    @Column(name = "trailer_type")
    private String trailerType;

    @Column(name = "mover_type")
    @Enumerated(EnumType.STRING)
    private MoverEnum moverType;

    public Tractor() {
    }

    public Tractor(String carBrand, String carModel, String carCategory, String stateNumber, String carType, String yearOfProduction, boolean hasTrailer, String trailerType, MoverEnum moverType) {
        super(carBrand, carModel, carCategory, stateNumber, carType, yearOfProduction, hasTrailer);
        this.trailerType = trailerType;
        this.moverType = moverType;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public MoverEnum getMoverType() {
        return moverType;
    }

    public void setMoverType(MoverEnum moverType) {
        this.moverType = moverType;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "trailerType='" + trailerType + '\'' +
                ", moverType=" + moverType +
                '}';
    }
}
