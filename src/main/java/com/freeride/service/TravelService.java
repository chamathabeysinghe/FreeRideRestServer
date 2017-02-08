package com.freeride.service;


import com.freeride.model.Travel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */

public interface TravelService {

    Travel findById(Long id);

    void saveTravel(Travel travel);

    void updateTravel(Travel travel);

    void deleteTravel(Long id);

    void deleteAllTravel();

    boolean isTravelExist(Travel travel);

}
