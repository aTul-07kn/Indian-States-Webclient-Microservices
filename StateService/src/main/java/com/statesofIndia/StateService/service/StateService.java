package com.statesofIndia.StateService.service;

import com.statesofIndia.StateService.dto.FullResponse;
import com.statesofIndia.StateService.model.State;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface StateService {

    State addState(State state);
    FullResponse getState(String scode);

    List<State> getAllStates();
}
