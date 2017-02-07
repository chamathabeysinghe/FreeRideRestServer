package com.freeride.service;

import com.freeride.model.User;
import com.freeride.model.Vehicle;
import com.freeride.repositories.UserRepository;
import com.freeride.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;


    @Override
    public Vehicle findById(Long id) {
        return vehicleRepository.findOne(id);
    }

    @Override
    public Vehicle findByUser(String userId) {
        return null;//vehicleRepository.findByUserId(userId);
    }

    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        saveVehicle(vehicle);
    }

    @Override
    public void deleteVehicleById(Long id) {
        vehicleRepository.delete(id);
    }

    @Override
    public void deleteAllVehicles() {

    }

    @Override
    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public boolean isVehicleExists(Vehicle vehicle) {
        return false;
    }
}
