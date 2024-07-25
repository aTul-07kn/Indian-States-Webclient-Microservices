package com.statesofIndia.DistrictService.service;

import com.statesofIndia.DistrictService.model.District;
import com.statesofIndia.DistrictService.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepo repo;

    public List<District> addDistricts(List<District> districts) {
        return repo.saveAll(districts);
    }

    public District getDistrict(Long did) {
        return repo.findByDid(did);
    }

    public List<District> getDistrictsByScode(String scode) {
        return repo.findByScode(scode);
    }
}