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

import com.souvik.nicscovidportal.model.Producttype;
import com.souvik.nicscovidportal.service.ProducttypeService;


@RestController
public class ProducttypeController {

	@Autowired
	ProducttypeService p;
	
	@GetMapping("/producttype")
	public List<Producttype> getProducttypes(){
		return this.p.getProducttypes();
	}
	@GetMapping("/producttype/{pid}")
	public Producttype getProducttype(@PathVariable String pid) {
		return this.p.getProducttype(Long.parseLong(pid));
		
	}
	@PostMapping("/producttype")
	public Producttype postProducttype(@RequestBody Producttype pnew) {
		return this.p.postProducttype(pnew);
	}
	@PutMapping("/producttype")
	public Producttype updateProducttype(@RequestBody Producttype pup) {
		return this.p.updateProducttype(pup);
	}
	@DeleteMapping("/producttype/{pid}")
	public Producttype deleteProducttype(@PathVariable String pid) {
		return this.p.deleteProducttype(Long.parseLong(pid));
	}
}
