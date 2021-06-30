package com.souvik.nicscovidportal.model;

import javax.persistence.Column;

//import java.io.Serializable;

//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Proxy;

/*
@Embeddable
class BedHosp implements Serializable{
	
}*/

@Entity @Proxy(lazy=false)
public class Bedinfo {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bedinfo_g")
	@SequenceGenerator(name="bedinfo_g", sequenceName = "bedinfo_g")
	private Long bedinfoid;
	@ManyToOne
	Hospital h1;
	@ManyToOne
	Bedtype b1;
	Integer totalbed;
	Integer occupiedbed;
	Integer availbed;
	public Long getBedinfoid() {
		return bedinfoid;
	}
	public void setBedinfoid(Long bedinfoid) {
		this.bedinfoid = bedinfoid;
	}
	public Hospital getH1() {
		return h1;
	}
	public void setH1(Hospital h1) {
		this.h1 = h1;
	}
	public Bedtype getB1() {
		return b1;
	}
	public void setB1(Bedtype b1) {
		this.b1 = b1;
	}
	public Integer getTotalbed() {
		return totalbed;
	}
	public void setTotalbed(Integer totalbed) {
		this.totalbed = totalbed;
	}
	public Integer getOccupiedbed() {
		return occupiedbed;
	}
	public void setOccupiedbed(Integer occupiedbed) {
		this.occupiedbed = occupiedbed;
	}
	public Integer getAvailbed() {
		return availbed;
	}
	public void setAvailbed(Integer availbed) {
		this.availbed = availbed;
	}
	public Bedinfo(Long bedinfoid, Hospital h1, Bedtype b1, Integer totalbed, Integer occupiedbed, Integer availbed) {
		super();
		this.bedinfoid = bedinfoid;
		this.h1 = h1;
		this.b1 = b1;
		this.totalbed = totalbed;
		this.occupiedbed = occupiedbed;
		this.availbed = availbed;
	}
	public Bedinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bedinfo [bedinfoid=" + bedinfoid + ", h1=" + h1 + ", b1=" + b1 + ", totalbed=" + totalbed
				+ ", occupiedbed=" + occupiedbed + ", availbed=" + availbed + "]";
	}
}