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

import com.souvik.nicscovidportal.model.Bedinfo;
import com.souvik.nicscovidportal.service.BedinfoService;



@RestController
public class BedinfoController {

	@Autowired
	BedinfoService b;
	
	@GetMapping("/bedinfo")
	public List<Bedinfo> getBedinfos(){
		return this.b.getBedinfos();
	}
	@GetMapping("/bedinfo/{bid}")
	public Bedinfo getBedinfo(@PathVariable String bid) {
		return this.b.getBedinfo(Long.parseLong(bid));
		
	}
	@PostMapping("/bedinfo")
	public Bedinfo postBedinfo(@RequestBody Bedinfo bnew) {
		return this.b.postBedinfo(bnew);
	}
	@PutMapping("/bedinfo")
	public Bedinfo updateBedinfo(@RequestBody Bedinfo bup) {
		return this.b.updateBedinfo(bup);
	}
	@DeleteMapping("/bedinfo/{bid}")
	public Bedinfo deleteBedinfo(@PathVariable String bid) {
		return this.b.deleteBedinfo(Long.parseLong(bid));
	}
}
