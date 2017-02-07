package com.freeride.repositories;

import com.freeride.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {
    Travel findByFromLocation(String fromLocation);
    Travel findByEndLocation(String endLocation);
}
