package com.crm.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CRD1")
public class CRD1 implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CardCode")
	 private String CardCode;
	
	@Column(name = "Address")
	 private String Address;
	
	
	
	
	@Column(name = "City")
	 private String City;
	
	@Column(name = "Country")
	 private String Country;
	
	@Column(name = "U_HBT_DirMM")
	 private String U_HBT_DirMM;
	
	

	public CRD1() {
		
	}



	public CRD1(String cardCode, String address, String city, String country, String u_HBT_DirMM) {
		super();
		CardCode = cardCode;
		Address = address;
		City = city;
		Country = country;
		U_HBT_DirMM = u_HBT_DirMM;
	}



	public String getCardCode() {
		return CardCode;
	}



	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getCountry() {
		return Country;
	}



	public void setCountry(String country) {
		Country = country;
	}



	public String getU_HBT_DirMM() {
		return U_HBT_DirMM;
	}



	public void setU_HBT_DirMM(String u_HBT_DirMM) {
		U_HBT_DirMM = u_HBT_DirMM;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
