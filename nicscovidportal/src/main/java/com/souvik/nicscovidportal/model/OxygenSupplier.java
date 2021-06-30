package com.souvik.nicscovidportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity @Proxy(lazy=false)
@Table(name = "oxygensupplier")
public class OxygenSupplier {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oxygensupplier_g")
	@SequenceGenerator(name="oxygensupplier_g", sequenceName = "oxygensupplier_g")
	private Long oid;
	private String opass;
	private String oname;
	private String oaddress;
	private String ocontactper;
	private String ocontactno;
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getOpass() {
		return opass;
	}
	public void setOpass(String opass) {
		this.opass = opass;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public String getOcontactper() {
		return ocontactper;
	}
	public void setOcontactper(String ocontactper) {
		this.ocontactper = ocontactper;
	}
	public String getOcontactno() {
		return ocontactno;
	}
	public void setOcontactno(String ocontactno) {
		this.ocontactno = ocontactno;
	}
	public OxygenSupplier(Long oid, String opass, String oname, String oaddress, String ocontactper, String ocontactno) {
		super();
		this.oid = oid;
		this.opass = opass;
		this.oname = oname;
		this.oaddress = oaddress;
		this.ocontactper = ocontactper;
		this.ocontactno = ocontactno;
	}
	public OxygenSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OxygenSupplier [oid=" + oid + ", opass=" + opass + ", oname=" + oname + ", oaddress=" + oaddress
				+ ", ocontactper=" + ocontactper + ", ocontactno=" + ocontactno + "]";
	}

}
