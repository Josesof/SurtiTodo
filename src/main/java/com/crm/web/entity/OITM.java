package com.crm.web.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




//Producto


@Entity(name = "OITM")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class OITM implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="ItemCode",nullable = false, length= 255)	
	private String ItemCode;

	@Column(name="ItemName")
	private String ItemName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = " ItemCode ",referencedColumnName = "ItemCode", insertable = false, updatable = false )
	private OITW oITW;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = " ItemCode ",referencedColumnName = "ItemCode", insertable = false, updatable = false )
	private ITM1 iTM1;

	

	public OITM() {

	}
	
	public Double calcularImporte() {
		return oITW.getOnHand().doubleValue() * iTM1.getPrice();
	}

	public OITM(String itemCode, String itemName, OITW oITW, ITM1 iTM1) {
		super();
		ItemCode = itemCode;
		ItemName = itemName;
		this.oITW = oITW;
		this.iTM1 = iTM1;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public OITW getoITW() {
		return oITW;
	}

	public void setoITW(OITW oITW) {
		this.oITW = oITW;
	}

	public ITM1 getiTM1() {
		return iTM1;
	}

	public void setiTM1(ITM1 iTM1) {
		this.iTM1 = iTM1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	


	
	


}
