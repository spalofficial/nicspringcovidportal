package com.souvik.nicscovidportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Proxy;

@Entity @Proxy(lazy=false)
public class Ambulance {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ambulance_g")
	@SequenceGenerator(name="ambulance_g", sequenceName = "ambulance_g")
	private Long aid;
	private String apass;
	private String aname;
	private String aaddress;
	private String acontactper;
	private String acontactno;
	public Long getAid() {
		return aid;
	}
	public void setAid(Long aid) {
		this.aid = aid;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	public String getAcontactper() {
		return acontactper;
	}
	public void setAcontactper(String acontactper) {
		this.acontactper = acontactper;
	}
	public String getAcontactno() {
		return acontactno;
	}
	public void setAcontactno(String acontactno) {
		this.acontactno = acontactno;
	}
	public Ambulance(Long aid, String apass, String aname, String aaddress, String acontactper, String acontactno) {
		super();
		this.aid = aid;
		this.apass = apass;
		this.aname = aname;
		this.aaddress = aaddress;
		this.acontactper = acontactper;
		this.acontactno = acontactno;
	}
	public Ambulance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ambulance [aid=" + aid + ", apass=" + apass + ", aname=" + aname + ", aaddress=" + aaddress
				+ ", acontactper=" + acontactper + ", acontactno=" + acontactno + "]";
	}
}
