package com.freeride.service;

import com.freeride.model.User;
import com.freeride.model.Vehicle;
import com.freeride.repositories.UserRepository;
import com.freeride.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */

@Service("vehicleService")
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;


    @Override
    public Vehicle findById(Long id) {
        return vehicleRepository.findOne(id);
    }

    @Override
    public List<Vehicle> findByUserId(String userId) {
        return vehicleRepository.findByUserId(userId);
    }


    @Override
    public Vehicle findByNumber(String number) {
        return vehicleRepository.findByNumber(number);
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
        return (findByNumber(vehicle.getNumber())!=null);
    }
}
