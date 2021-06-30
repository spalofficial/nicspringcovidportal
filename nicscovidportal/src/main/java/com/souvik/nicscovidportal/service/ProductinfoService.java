package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Productinfo;

@Service
public interface ProductinfoService {

	List<Productinfo> getProductinfos();

	Productinfo getProductinfo(long parseLong);

	Productinfo postProductinfo(Productinfo pnew);

	Productinfo updateProductinfo(Productinfo pup);

	Productinfo deleteProductinfo(long parseLong);

}
