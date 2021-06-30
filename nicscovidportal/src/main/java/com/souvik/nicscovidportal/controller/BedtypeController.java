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

import com.souvik.nicscovidportal.model.Bedtype;
import com.souvik.nicscovidportal.service.BedtypeService;



@RestController
public class BedtypeController {

	@Autowired
	BedtypeService b;
	
	@GetMapping("/bedtype")
	public List<Bedtype> getBedtypes(){
		return this.b.getbedtypes();
	}
	@GetMapping("/bedtype/{bid}")
	public Bedtype getBedtype(@PathVariable String bid) {
		return this.b.getBedtype(Long.parseLong(bid));
		
	}
	@PostMapping("/bedtype")
	public Bedtype postBedtype(@RequestBody Bedtype bnew) {
		return this.b.postBedtype(bnew);
	}
	@PutMapping("/bedtype")
	public Bedtype updateBedtype(@RequestBody Bedtype bup) {
		return this.b.updateBedtype(bup);
	}
	@DeleteMapping("/bedtype/{bid}")
	public Bedtype deleteBedtype(@PathVariable String bid) {
		return this.b.deleteBedtype(Long.parseLong(bid));
	}
}
