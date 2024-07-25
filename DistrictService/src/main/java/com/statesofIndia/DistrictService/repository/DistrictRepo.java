package com.statesofIndia.DistrictService.repository;

import com.statesofIndia.DistrictService.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Long> {
    District findByDid(Long did);

    List<District> findByScode(String scode);
}
