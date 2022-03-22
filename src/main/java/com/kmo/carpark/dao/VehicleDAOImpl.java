package com.kmo.carpark.dao;

import com.kmo.carpark.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VehicleDAOImpl implements VehicleDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Vehicle> getAllVehicles() {
        Query query = entityManager.createQuery("from Vehicle");
        List<Vehicle> vehicles = query.getResultList();

        return vehicles;
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        entityManager.merge(vehicle);
    }

    @Override
    public Vehicle getVehicle(int id) {
        Vehicle vehicle = entityManager.find(Vehicle.class, id);
        return vehicle;
    }

    @Override
    public void deleteVehicle(int id) {
        Query query = entityManager.createQuery("delete from Vehicle where id =:vehicleId");
        query.setParameter("vehicleId", id);
        query.executeUpdate();
    }
}
