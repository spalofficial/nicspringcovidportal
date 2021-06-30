package com.souvik.nicscovidportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.nicscovidportal.model.Ambulance;
import com.souvik.nicscovidportal.service.AmbulanceSerivce;


@RestController
public class AmbulanceController {

	@Autowired
	AmbulanceSerivce amb;
	
	@GetMapping("/ambulance")
	public List<Ambulance> getambulances(){
		return this.amb.getambulances();
	}
	@GetMapping("/ambulance/{aid}")
	public Ambulance getambulance(@PathVariable String aid) {
		return this.amb.getambulance(Long.parseLong(aid));
		
	}
	@PostMapping("/ambulance")
	public Ambulance postambulance(@RequestBody Ambulance ambnew) {
		return this.amb.postambulance(ambnew);
	}
	@PutMapping("/ambulance")
	public Ambulance updateambulance(@RequestBody Ambulance ambup) {
		return this.amb.updateambulance(ambup);
	}
	@DeleteMapping("/ambulance/{aid}")
	public Ambulance deleteambulance(@PathVariable String aid) {
		return this.amb.deleteambulance(Long.parseLong(aid));
	}
}
