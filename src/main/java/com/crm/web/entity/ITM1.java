package com.crm.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITM1")
public class ITM1 implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ItemCode")
	private String ItemCode;

	@Column(name = "Price")
	private long Price;

	public ITM1() {
		super();

	}
	

	public ITM1(String itemCode, long price) {

		ItemCode = itemCode;
		Price = price;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		Price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
