package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.AmbulanceDao;
import com.souvik.nicscovidportal.model.Ambulance;

@Service
public class AmbulanceServiceimpl implements AmbulanceSerivce {

	@Autowired
	AmbulanceDao a1;
	@Override
	public List<Ambulance> getambulances() {
		return this.a1.findAll();
	}

	@Override
	public Ambulance getambulance(Long parseInt) {
		return this.a1.getById(parseInt);
	}

	@Override
	public Ambulance updateambulance(Ambulance ambup) {
		return a1.save(ambup);
	}

	@Override
	public Ambulance postambulance(Ambulance ambnew) {
		return a1.save(ambnew);
	}

	@Override
	public Ambulance deleteambulance(Long parseInt) {
		Ambulance hdelete= a1.getById(parseInt);
		a1.delete(hdelete);
		return hdelete;
	}
	}
