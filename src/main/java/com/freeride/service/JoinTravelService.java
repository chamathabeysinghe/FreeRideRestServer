package com.freeride.service;

import com.freeride.model.JoinTravel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */

public interface JoinTravelService {
    JoinTravel findById(Long id);

    void saveJoinTravel(JoinTravel joinTravel);

    void updateJoinTravel(JoinTravel joinTravel);

    void deleteJoinTravel(Long id);

    void deleteAllJoinTravel();

}
