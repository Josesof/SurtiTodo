package com.crm.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "INV1")
public class Inv1  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocEntry")
	private int DocEntry;
	
	@Column(name = "ItemCode")
	private String ItemCode;
	
	@Column(name = "Dscription")
	private String Dscription;
	
	@Column(name = "Quantity")
	private float Quantity;
	
	@Column(name = "Price")
	private float Price;
	
	@Column(name = "DiscPrcnt")
	private float DiscPrcnt;

	public Inv1() {

	}

	public Inv1(int docEntry, String itemCode, String dscription, float quantity, float price, float discPrcnt) {
		
		DocEntry = docEntry;
		ItemCode = itemCode;
		Dscription = dscription;
		Quantity = quantity;
		Price = price;
		DiscPrcnt = discPrcnt;
	}

	public int getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(int docEntry) {
		DocEntry = docEntry;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getDscription() {
		return Dscription;
	}

	public void setDscription(String dscription) {
		Dscription = dscription;
	}

	public float getQuantity() {
		return Quantity;
	}

	public void setQuantity(float quantity) {
		Quantity = quantity;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public float getDiscPrcnt() {
		return DiscPrcnt;
	}

	public void setDiscPrcnt(float discPrcnt) {
		DiscPrcnt = discPrcnt;
	}
	
	
	
	

	

}
