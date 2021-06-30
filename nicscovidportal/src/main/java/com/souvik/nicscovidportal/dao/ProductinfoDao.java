package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.Productinfo;

@Component
public interface ProductinfoDao extends JpaRepository<Productinfo, Long>{

}
