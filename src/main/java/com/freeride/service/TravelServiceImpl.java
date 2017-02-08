package com.freeride.service;

import com.freeride.model.Travel;
import com.freeride.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chamath Abeysinghe on 2/8/2017.
 */

@Service("travelService")
@Transactional
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelRepository travelRepository;
    @Override
    public Travel findById(Long id) {
        return travelRepository.findOne(id);
    }

    @Override
    public void saveTravel(Travel travel) {
        travelRepository.save(travel);
    }

    @Override
    public void updateTravel(Travel travel) {
        travelRepository.save(travel);
    }

    @Override
    public void deleteTravel(Long id) {
        travelRepository.delete(id);
    }

    @Override
    public void deleteAllTravel() {
        travelRepository.deleteAll();
    }

    @Override
    public boolean isTravelExist(Travel travel) {
        return false;
    }
}
