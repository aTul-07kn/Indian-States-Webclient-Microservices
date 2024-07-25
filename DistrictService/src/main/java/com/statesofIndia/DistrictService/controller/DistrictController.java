package com.statesofIndia.DistrictService.controller;

import com.statesofIndia.DistrictService.model.District;
import com.statesofIndia.DistrictService.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired
    private DistrictService districtService;

    @PostMapping("/addDistricts")
    public String addDistricts(@RequestBody List<District> districts) {
        List<District> savedDistricts=districtService.addDistricts(districts);
        return "Successfully added "+ savedDistricts.size()+ " Districts";
    }

    @GetMapping("/getdistrict/{did}")
    public District getDistrict(@PathVariable Long did) {
        return districtService.getDistrict(did);
    }

    @GetMapping("/getDistrictsByScode/{scode}")
    public List<District> getDistrictsByScode(@PathVariable String scode) {
        return districtService.getDistrictsByScode(scode);
    }
}