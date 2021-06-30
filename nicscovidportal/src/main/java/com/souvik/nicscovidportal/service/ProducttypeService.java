package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Producttype;

@Service
public interface ProducttypeService {

	List<Producttype> getProducttypes();

	Producttype getProducttype(long parseLong);

	Producttype postProducttype(Producttype pnew);

	Producttype updateProducttype(Producttype pup);

	Producttype deleteProducttype(long parseLong);

}
