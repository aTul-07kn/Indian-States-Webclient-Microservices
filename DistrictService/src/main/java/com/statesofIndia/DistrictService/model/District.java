package com.statesofIndia.DistrictService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="district")
public class District {

    @Id
    private long did;
    private String dname;
    private long population;
    private String area;
    private String scode;
}
