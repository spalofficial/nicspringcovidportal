package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.Ambulance;

@Component
public interface AmbulanceDao extends JpaRepository<Ambulance, Long>{

}
