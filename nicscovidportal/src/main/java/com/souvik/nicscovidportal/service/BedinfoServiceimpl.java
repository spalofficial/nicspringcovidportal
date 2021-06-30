package com.souvik.nicscovidportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.nicscovidportal.dao.BedinfoDao;
import com.souvik.nicscovidportal.model.Bedinfo;

@Service
public class BedinfoServiceimpl implements BedinfoService {

	@Autowired
	BedinfoDao a1;
	@Override
	public List<Bedinfo> getBedinfos() {
		return this.a1.findAll();
	}

	@Override
	public Bedinfo updateBedinfo(Bedinfo bup) {
		return a1.save(bup);
	}

	@Override
	public Bedinfo postBedinfo(Bedinfo bnew) {
		return a1.save(bnew);
	}

	@Override
	public Bedinfo deleteBedinfo(long parseLong) {

		return this.a1.getById(parseLong);
		
	}

	@Override
	public Bedinfo getBedinfo(long parseLong) {
		Bedinfo hdelete= a1.getById(parseLong);
		a1.delete(hdelete);
		return hdelete;
		}
	}
