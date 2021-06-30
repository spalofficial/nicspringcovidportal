package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.Producttype;
@Component
public interface ProducttypeDao extends JpaRepository<Producttype, Long>{

}
