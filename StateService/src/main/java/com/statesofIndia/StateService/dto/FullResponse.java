package com.statesofIndia.StateService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    private Statedto stateDto;
    private List<Districtdto> districtDto;
}