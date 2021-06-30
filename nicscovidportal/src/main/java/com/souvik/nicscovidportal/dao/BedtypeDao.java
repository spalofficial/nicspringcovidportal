package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.Bedtype;

@Component
public interface BedtypeDao extends JpaRepository<Bedtype, Long>{

}
