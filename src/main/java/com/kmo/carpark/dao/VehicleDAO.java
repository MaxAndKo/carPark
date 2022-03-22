package com.kmo.carpark.dao;

import com.kmo.carpark.entity.Vehicle;

import java.util.List;

public interface VehicleDAO {
    public List<Vehicle> getAllVehicles();

    public void saveVehicle(Vehicle vehicle);

    public Vehicle getVehicle(int id);

    public void deleteVehicle(int id);
}
