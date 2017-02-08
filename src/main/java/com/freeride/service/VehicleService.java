package com.freeride.service;

import com.freeride.model.Vehicle;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */

public interface VehicleService {

    Vehicle findById(Long id);

    List<Vehicle> findByUserId(String userId);

    Vehicle findByNumber(String number);

    void saveVehicle(Vehicle user);

    void updateVehicle(Vehicle user);

    void deleteVehicleById(Long id);

    void deleteAllVehicles();

    List<Vehicle> findAllVehicles();

    boolean isVehicleExists(Vehicle vehicle);
}
