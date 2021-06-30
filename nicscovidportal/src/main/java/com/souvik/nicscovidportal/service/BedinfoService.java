package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.model.Bedinfo;

@Service
public interface BedinfoService {

	Bedinfo deleteBedinfo(long parseLong);

	Bedinfo updateBedinfo(Bedinfo bup);

	Bedinfo postBedinfo(Bedinfo bnew);

	Bedinfo getBedinfo(long parseLong);

	List<Bedinfo> getBedinfos();

}
