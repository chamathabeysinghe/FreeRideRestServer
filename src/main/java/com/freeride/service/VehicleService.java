package com.freeride.service;

import com.freeride.model.Vehicle;

import java.util.List;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */
public interface VehicleService {

    Vehicle findById(Long id);

    Vehicle findByUser(String name);

    void saveVehicle(Vehicle user);

    void updateVehicle(Vehicle user);

    void deleteVehicleById(Long id);

    void deleteAllVehicles();

    List<Vehicle> findAllVehicles();

    boolean isVehicleExists(Vehicle vehicle);
}
