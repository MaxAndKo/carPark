package com.kmo.carpark.service;

import com.kmo.carpark.dto.VehicleDTO;
import com.kmo.carpark.entity.Vehicle;

import java.util.List;

public interface VehicleService {
//    public List<Vehicle> getAllVehicles();
    public List<VehicleDTO> getAllVehicles();

    public void saveVehicle(Vehicle vehicle);

    public Vehicle getVehicle(int id);

    public void deleteVehicle(int id);

}
