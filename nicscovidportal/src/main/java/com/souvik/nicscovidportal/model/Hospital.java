package com.souvik.nicscovidportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Proxy;


@Entity @Proxy(lazy=false)
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hospital_g")
	@SequenceGenerator(name="hospital_g", sequenceName = "hospital_g")
	@Column(name = "hid")
	private Long hid;
	private String hpass;
	private String hname;
	private String haddress;
	private String hcontactper;
	private String hcontactno;
	public Long getHid() {
		return hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}
	public String getHpass() {
		return hpass;
	}
	public void setHpass(String hpass) {
		this.hpass = hpass;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHaddress() {
		return haddress;
	}
	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	public String getHcontactper() {
		return hcontactper;
	}
	public void setHcontactper(String hcontactper) {
		this.hcontactper = hcontactper;
	}
	public String getHcontactno() {
		return hcontactno;
	}
	public void setHcontactno(String hcontactno) {
		this.hcontactno = hcontactno;
	}
	public Hospital(Long hid, String hpass, String hname, String haddress, String hcontactper, String hcontactno) {
		super();
		this.hid = hid;
		this.hpass = hpass;
		this.hname = hname;
		this.haddress = haddress;
		this.hcontactper = hcontactper;
		this.hcontactno = hcontactno;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", hpass=" + hpass + ", hname=" + hname + ", haddress=" + haddress
				+ ", hcontactper=" + hcontactper + ", hcontactno=" + hcontactno + "]";
	}
		
}
