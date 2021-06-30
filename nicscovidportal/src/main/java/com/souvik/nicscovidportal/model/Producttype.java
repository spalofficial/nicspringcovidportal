package com.souvik.nicscovidportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Proxy;

@Entity  @Proxy(lazy=false)
public class Producttype {
	@Id
	@Column(name = "bid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producttype_g")
	@SequenceGenerator(name="producttype_g", sequenceName = "producttype_g")
	private Long pid;
	private String pname;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Producttype(Long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Producttype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Producttype [pid=" + pid + ", pname=" + pname + "]";
	}
	

}
