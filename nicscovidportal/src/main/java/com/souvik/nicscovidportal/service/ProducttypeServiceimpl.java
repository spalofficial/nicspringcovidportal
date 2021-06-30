package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.ProducttypeDao;
import com.souvik.nicscovidportal.model.Producttype;


@Service
public class ProducttypeServiceimpl implements ProducttypeService {

	@Autowired
	ProducttypeDao a1;
	@Override
	public List<Producttype> getProducttypes() {
		return this.a1.findAll();
	}


	@Override
	public Producttype updateProducttype(Producttype pup) {
		return a1.save(pup);
	}

	@Override
	public Producttype postProducttype(Producttype pnew) {
		return a1.save(pnew);
	}

	@Override
	public Producttype getProducttype(long parseLong) {
		return this.a1.getById(parseLong);
	}

	@Override
	public Producttype deleteProducttype(long parseLong) {
		Producttype hdelete= a1.getById(parseLong);
		a1.delete(hdelete);
		return hdelete;
	}
	}
