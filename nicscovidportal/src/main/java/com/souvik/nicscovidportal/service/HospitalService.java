package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Hospital;
@Service
public interface HospitalService {
	public List<Hospital> getHospitals();

	public Hospital getHospital(Long hid);

	public Hospital postHospital(Hospital h);

	public Hospital updateHospital(Hospital h);

	public Hospital deleteHospital(Long i);
}
