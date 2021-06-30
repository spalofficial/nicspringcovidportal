package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.OxygenSupplier;

@Component
public interface OxygenSupplierDao extends JpaRepository<OxygenSupplier, Long> {

}
