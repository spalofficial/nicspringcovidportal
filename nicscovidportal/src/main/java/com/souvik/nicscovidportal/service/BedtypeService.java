package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Bedtype;

@Service
public interface BedtypeService {

	List<Bedtype> getbedtypes();

	Bedtype getBedtype(long parseLong);

	Bedtype postBedtype(Bedtype bnew);

	Bedtype updateBedtype(Bedtype bup);

	Bedtype deleteBedtype(long parseLong);

}
