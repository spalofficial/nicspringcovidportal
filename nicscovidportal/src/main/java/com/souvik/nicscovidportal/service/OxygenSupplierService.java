package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.OxygenSupplier;

@Service
public interface OxygenSupplierService {

	List<OxygenSupplier> getoxygensuppliers();

	OxygenSupplier getoxygensupplier(Long parseInt);

	OxygenSupplier postoxygensupplier(OxygenSupplier osp);

	OxygenSupplier deleteoxygensupplier(Long oid);

	OxygenSupplier updateoxygensupplier(OxygenSupplier osup);

}
