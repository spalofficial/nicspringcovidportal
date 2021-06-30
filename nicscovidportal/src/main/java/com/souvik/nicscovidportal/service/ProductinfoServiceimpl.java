package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.ProductinfoDao;
import com.souvik.nicscovidportal.model.Productinfo;

@Service
public class ProductinfoServiceimpl implements ProductinfoService {

	@Autowired
	ProductinfoDao a1;
	@Override
	public List<Productinfo> getProductinfos() {
		return this.a1.findAll();
	}

	@Override
	public Productinfo updateProductinfo(Productinfo pup) {
		return a1.save(pup);
	}

	@Override
	public Productinfo postProductinfo(Productinfo pnew) {
		return a1.save(pnew);
	}

	@Override
	public Productinfo getProductinfo(long parseLong) {
		return this.a1.getById(parseLong);

	}

	@Override
	public Productinfo deleteProductinfo(long parseLong) {
		Productinfo hdelete= a1.getById(parseLong);
		a1.delete(hdelete);
		return hdelete;
	}
	}