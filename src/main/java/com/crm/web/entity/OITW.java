package com.crm.web.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.Table;

@Entity
@Table(name = "OITW")
public class OITW implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ItemCode")
	private String ItemCode;

	@Column(name = "OnHand")
	private Integer OnHand;

	@Column(name = "IsCommited")
	private int IsCommited;

	

	public OITW() {
		super();
	}



	public OITW(String itemCode, Integer onHand, int isCommited) {
		super();
		ItemCode = itemCode;
		OnHand = onHand;
		IsCommited = isCommited;
	
		
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public Integer getOnHand() {
		return OnHand;
	}

	public void setOnHand(Integer onHand) {
		OnHand = onHand;
	}

	public int getIsCommited() {
		return IsCommited;
	}

	public void setIsCommited(int isCommited) {
		IsCommited = isCommited;
	}



	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
