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

import com.souvik.nicscovidportal.model.Hospital;
import com.souvik.nicscovidportal.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	HospitalService h;
	
	@GetMapping("/hospital")
	public List<Hospital> getHospitals(){
		
		return this.h.getHospitals();
 }
	@GetMapping("/hospital/{hid}")
	public Hospital getHospital(@PathVariable String hid) {
		
		return this.h.getHospital(Long.parseLong(hid));
	}
	
	@PostMapping("/hospital")
	public Hospital postHospital(@RequestBody Hospital hnew) {
		
		return this.h.postHospital(hnew);
	}
	
	@PutMapping("/hospital/")
	public Hospital updateHospital(@RequestBody Hospital hup) {
		return this.h.updateHospital(hup);
	}
	
	@DeleteMapping("/hospital/{hid}")
	public Hospital deleteHospital(@PathVariable String hid) {
		return this.h.deleteHospital(Long.parseLong(hid));
	}
}
