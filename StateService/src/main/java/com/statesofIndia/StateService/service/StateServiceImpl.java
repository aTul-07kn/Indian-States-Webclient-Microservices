package com.statesofIndia.StateService.service;

import com.statesofIndia.StateService.dto.Districtdto;
import com.statesofIndia.StateService.dto.FullResponse;
import com.statesofIndia.StateService.dto.Statedto;
import com.statesofIndia.StateService.model.State;
import com.statesofIndia.StateService.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository repo;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Override
    public State addState(State state){
        return repo.save(state);
    }

    @Override
    public FullResponse getState(String scode) {
        FullResponse res=new FullResponse();
        State state=repo.findByScode(scode);

        Statedto statedto=entityToDto(state);

        List<Districtdto> dirstictList=webClientBuilder.baseUrl("http://localhost:9098")
                .build()
                .get()
                .uri("/district/getDistrictsByScode/"+state.getScode())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Districtdto>>(){})
                .block();

        res.setStateDto(statedto);
        res.setDistrictDto(dirstictList);
        return res;
    }

    @Override
    public List<State> getAllStates(){
        return repo.findAll();
    }

    private Statedto entityToDto(State state) {
        Statedto dto=new Statedto();
        dto.setScode(state.getScode());
        dto.setStatename(state.getStateName());
        return dto;
    }
}