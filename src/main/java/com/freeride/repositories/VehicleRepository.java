package com.freeride.repositories;

import com.freeride.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle findByNumber(String number);
    List<Vehicle> findByUserId(String userId);

}
