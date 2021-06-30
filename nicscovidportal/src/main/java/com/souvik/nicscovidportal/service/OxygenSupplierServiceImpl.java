package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.OxygenSupplierDao;
import com.souvik.nicscovidportal.model.OxygenSupplier;

@Service
public class OxygenSupplierServiceImpl implements OxygenSupplierService {

	@Autowired
	OxygenSupplierDao o1;
	@Override
	public List<OxygenSupplier> getoxygensuppliers() {
		return this.o1.findAll();
	}
	@Override
	public OxygenSupplier getoxygensupplier(Long parseInt) {
		return this.o1.getById(parseInt);
	}
	@Override
	public OxygenSupplier postoxygensupplier(OxygenSupplier osp) {
		return this.o1.save(osp);
	}
	@Override
	public OxygenSupplier deleteoxygensupplier(Long oid) {
		OxygenSupplier odelete=o1.getById(oid);
		o1.delete(odelete);
		return odelete;
	}
	@Override
	public OxygenSupplier updateoxygensupplier(OxygenSupplier osup) {
		return this.o1.save(osup);
	}

}
