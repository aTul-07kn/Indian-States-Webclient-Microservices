package com.statesofIndia.StateService.controller;

import com.statesofIndia.StateService.dto.FullResponse;
import com.statesofIndia.StateService.model.State;
import com.statesofIndia.StateService.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PostMapping("/addState")
    public ResponseEntity<State> addState(@RequestBody State state){
        return new ResponseEntity<>(stateService.addState(state), HttpStatus.CREATED);
    }

    @GetMapping("/getAllStates")
    public ResponseEntity<List<State>> getAllStates(){
        return new ResponseEntity<>(stateService.getAllStates(), HttpStatus.OK);
    }

    @GetMapping("/getState/{scode}")
    public ResponseEntity<FullResponse> getState(@PathVariable String scode){
        FullResponse res=stateService.getState(scode);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
