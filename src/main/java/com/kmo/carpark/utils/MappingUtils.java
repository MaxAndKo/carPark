package com.kmo.carpark.utils;

import com.kmo.carpark.dto.VehicleDTO;
import com.kmo.carpark.entity.PassangerCar;
import com.kmo.carpark.entity.Tractor;
import com.kmo.carpark.entity.Truck;
import com.kmo.carpark.entity.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class MappingUtils {

    public static VehicleDTO mapToVehicleDTO(Vehicle vehicle){
        VehicleDTO vehicleDTO = new VehicleDTO();
        vehicleDTO.setId(vehicle.getId());
        vehicleDTO.setCarBrand(vehicle.getCarBrand());
        vehicleDTO.setCarModel(vehicle.getCarModel());
        vehicleDTO.setCarCategory(vehicle.getCarCategory());
        vehicleDTO.setStateNumber(vehicle.getStateNumber());
        vehicleDTO.setCarType(vehicle.getCarType());
        vehicleDTO.setYearOfProduction(vehicle.getYearOfProduction());
        vehicleDTO.setHasTrailer(vehicle.getHasTrailer());
        if (vehicle.getClass() == PassangerCar.class){
            PassangerCar passangerCar = (PassangerCar) vehicle;
            vehicleDTO.setCountOfAxles(passangerCar.getCountOfAxles());
            vehicleDTO.setCountOfPassengers(passangerCar.getCountOfPassengers());
        }
        else if (vehicle.getClass() == Truck.class)
        {
            Truck truck = (Truck) vehicle;
            vehicleDTO.setLoadCapacity(truck.getLoadCapacity());
            vehicleDTO.setBodyClosed(truck.getIsBodyClosed());

        } else if (vehicle.getClass() == Tractor.class){
            Tractor tractor = (Tractor) vehicle;
            vehicleDTO.setTrailerType(tractor.getTrailerType());
            vehicleDTO.setMoverType(tractor.getMoverType());
        }
        return vehicleDTO;
    }

}
