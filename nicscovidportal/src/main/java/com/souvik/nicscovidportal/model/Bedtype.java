package com.souvik.nicscovidportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Proxy;

@Entity  @Proxy(lazy=false)
public class Bedtype {
	@Id
	@Column(name = "bid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bedtype_g")
	@SequenceGenerator(name="bedtype_g", sequenceName = "bedtype_g")
	private Long bid;
	private String bname;
	public Long getBid() {
		return bid;
	}
	public void setBid(Long bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Bedtype(Long bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Bedtype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bedinfo [bid=" + bid + ", bname=" + bname + "]";
	}

}
