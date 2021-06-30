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

import com.souvik.nicscovidportal.model.OxygenSupplier;
import com.souvik.nicscovidportal.service.OxygenSupplierService;

@RestController
public class OxygenSupplierController {
	
	@Autowired
	OxygenSupplierService os;
	
	@GetMapping("/oxygensupplier")
	public List<OxygenSupplier> getoxygensupplier(){
		return this.os.getoxygensuppliers();
	}
	@GetMapping("/oxygensupplier/{oid}")
	public OxygenSupplier getoxygensupplier(@PathVariable String oid){
		return this.os.getoxygensupplier(Long.parseLong(oid));
	}
	
	@PostMapping("/oxygensupplier")
	public OxygenSupplier postoxygensupplier(@RequestBody OxygenSupplier osp) {
		return this.os.postoxygensupplier(osp);
	}
	@DeleteMapping("/oxygensupplier/{oid}")
	public OxygenSupplier deleteoxygensupplier(@PathVariable String oid) {
		return this.os.deleteoxygensupplier(Long.parseLong(oid));
	}
	@PutMapping("/oxygensupplier")
	public OxygenSupplier updateoxygensupplier(@RequestBody OxygenSupplier osup) {
		return this.os.updateoxygensupplier(osup);
		
	}

}
