package com.souvik.nicscovidportal.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Ambulance;

@Service
public interface AmbulanceSerivce {

	List<Ambulance> getambulances();

	Ambulance getambulance(Long parseInt);


	Ambulance updateambulance(Ambulance ambup);

	Ambulance postambulance(Ambulance ambnew);

    Ambulance deleteambulance(Long parseInt);





}
