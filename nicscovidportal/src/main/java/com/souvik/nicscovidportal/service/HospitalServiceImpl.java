package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.HospitalDao;
import com.souvik.nicscovidportal.model.Hospital;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	HospitalDao h1;

	@Override
	public List<Hospital> getHospitals() {
		return h1.findAll();
	}

	@Override
	public Hospital getHospital(Long hid) {
		return h1.getById(hid);
	}

	@Override
	public Hospital postHospital(Hospital h) {
		return h1.save(h);
	}

	@Override
	public Hospital updateHospital(Hospital h) {
		return h1.save(h);
	}

	@Override
	public Hospital deleteHospital(Long i) {
		Hospital hfound=h1.getById(i);
		h1.delete(hfound);
		return hfound;
	}
}
