package com.souvik.nicscovidportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.souvik.nicscovidportal.model.Bedinfo;
@Component
public interface BedinfoDao extends JpaRepository<Bedinfo, Long> {

}
