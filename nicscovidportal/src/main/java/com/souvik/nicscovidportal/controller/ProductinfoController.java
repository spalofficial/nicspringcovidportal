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

import com.souvik.nicscovidportal.model.Productinfo;
import com.souvik.nicscovidportal.service.ProductinfoService;



@RestController
public class ProductinfoController {

	@Autowired
	ProductinfoService p;
	
	@GetMapping("/productinfo")
	public List<Productinfo> getProductinfos(){
		return this.p.getProductinfos();
	}
	@GetMapping("/productinfo/{pid}")
	public Productinfo getProductinfo(@PathVariable String pid) {
		return this.p.getProductinfo(Long.parseLong(pid));
		
	}
	@PostMapping("/productinfo")
	public Productinfo postProductinfo(@RequestBody Productinfo pnew) {
		return this.p.postProductinfo(pnew);
	}
	@PutMapping("/productinfo")
	public Productinfo updateProductinfo(@RequestBody Productinfo pup) {
		return this.p.updateProductinfo(pup);
	}
	@DeleteMapping("/Productinfo/{pid}")
	public Productinfo deleteProductinfo(@PathVariable String pid) {
		return this.p.deleteProductinfo(Long.parseLong(pid));
	}
}
