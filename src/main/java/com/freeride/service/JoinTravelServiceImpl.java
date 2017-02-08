package com.freeride.service;

import com.freeride.model.JoinTravel;
import com.freeride.repositories.JoinTravelRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */
public class JoinTravelServiceImpl implements JoinTravelService {
    @Autowired
    JoinTravelRepository joinTravelRepository;
    @Override
    public JoinTravel findById(Long id) {
        return joinTravelRepository.findOne(id);
    }

    @Override
    public void saveJoinTravel(JoinTravel joinTravel) {
        joinTravelRepository.save(joinTravel);
    }

    @Override
    public void updateJoinTravel(JoinTravel joinTravel) {
        joinTravelRepository.save(joinTravel);
    }

    @Override
    public void deleteJoinTravel(Long id) {
        joinTravelRepository.delete(id);
    }

    @Override
    public void deleteAllJoinTravel() {
        joinTravelRepository.deleteAll();
    }


}
