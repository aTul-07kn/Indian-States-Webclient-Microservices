package com.statesofIndia.StateService.repository;

import com.statesofIndia.StateService.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, String> {
    State findByScode(String scode);
}
