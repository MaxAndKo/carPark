package com.kmo.carpark.service;

import com.kmo.carpark.dao.VehicleDAO;
import com.kmo.carpark.dto.VehicleDTO;
import com.kmo.carpark.entity.Vehicle;
import com.kmo.carpark.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService{

    @Autowired
    private VehicleDAO vehicleDAO;

//    @Override
//    @Transactional
//    public List<Vehicle> getAllVehicles() {
//        return vehicleDAO.getAllVehicles();
//    }

    @Override
    @Transactional
    public List<VehicleDTO> getAllVehicles() {
        return vehicleDAO.getAllVehicles().stream().map(MappingUtils::mapToVehicleDTO).collect(Collectors.toList());
//        List<VehicleDTO> vehicleDTOS = new ArrayList<>();
//        for (Vehicle vehicle: vehicleDAO.getAllVehicles()) {
//            vehicleDTOS.add(MappingUtils.mapToVehicleDTO(vehicle));
//        }
//        return vehicleDTOS;
    }

    @Override
    @Transactional
    public void saveVehicle(Vehicle vehicle) {
        vehicleDAO.saveVehicle(vehicle);
    }

    @Override
    @Transactional
    public Vehicle getVehicle(int id) {
        return vehicleDAO.getVehicle(id);
    }

    @Override
    @Transactional
    public void deleteVehicle(int id) {
        vehicleDAO.deleteVehicle(id);
    }
}
