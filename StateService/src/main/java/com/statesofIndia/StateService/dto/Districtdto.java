package com.statesofIndia.StateService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Districtdto {
    private long did;
    private String dname;
    private long population;
    private String area;
    private String scode;
}
