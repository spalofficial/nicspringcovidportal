package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.BedtypeDao;
import com.souvik.nicscovidportal.model.Bedtype;

@Service
public class BedtypeServiceimpl implements BedtypeService {

	@Autowired
	BedtypeDao a1;

	@Override
	public Bedtype updateBedtype(Bedtype bup) {
		return a1.save(bup);
	}

	@Override
	public Bedtype postBedtype(Bedtype bnew) {
		return a1.save(bnew);
	}

	@Override
	public List<Bedtype> getbedtypes() {
		return this.a1.findAll();
	}

	@Override
	public Bedtype getBedtype(long parseLong) {
		return this.a1.getById(parseLong);
	}

	@Override
	public Bedtype deleteBedtype(long parseLong) {
		Bedtype hdelete= a1.getById(parseLong);
		a1.delete(hdelete);
		return hdelete;
	}
	}
