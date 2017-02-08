package com.freeride.repositories;

import com.freeride.model.JoinTravel;
import com.freeride.model.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */
@Repository
public interface JoinTravelRepository extends JpaRepository<JoinTravel, Long> {

}
