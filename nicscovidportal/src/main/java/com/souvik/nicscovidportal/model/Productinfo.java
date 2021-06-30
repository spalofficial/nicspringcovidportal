package com.souvik.nicscovidportal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

@Entity  @Proxy(lazy=false)
public class Productinfo {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productinfo_g")
	@SequenceGenerator(name="productinfo_g", sequenceName = "productinfo_g")
	private Long proinfoid;
	@ManyToOne
	OxygenSupplier o1;
	@ManyToOne
	Producttype p1;
	@Temporal(TemporalType.DATE)
	Date asondate;
	Integer availunit;
	Integer rate;
	public Long getProinfoid() {
		return proinfoid;
	}
	public void setProinfoid(Long proinfoid) {
		this.proinfoid = proinfoid;
	}
	public OxygenSupplier getO1() {
		return o1;
	}
	public void setO1(OxygenSupplier o1) {
		this.o1 = o1;
	}
	public Producttype getP1() {
		return p1;
	}
	public void setP1(Producttype p1) {
		this.p1 = p1;
	}
	public Date getAsondate() {
		return asondate;
	}
	public void setAsondate(Date asondate) {
		this.asondate = asondate;
	}
	public Integer getAvailunit() {
		return availunit;
	}
	public void setAvailunit(Integer availunit) {
		this.availunit = availunit;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Productinfo(Long proinfoid, OxygenSupplier o1, Producttype p1, Date asondate, Integer availunit,
			Integer rate) {
		super();
		this.proinfoid = proinfoid;
		this.o1 = o1;
		this.p1 = p1;
		this.asondate = asondate;
		this.availunit = availunit;
		this.rate = rate;
	}
	public Productinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Productinfo [proinfoid=" + proinfoid + ", o1=" + o1 + ", p1=" + p1 + ", asondate=" + asondate
				+ ", availunit=" + availunit + ", rate=" + rate + "]";
	}
	

}
