package com.crm.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "RIN1")
public class Rin1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ItemCode")
	private String ItemCode;
	
	@Column(name = "Dscription")
	private String Dscription;
	
	@Column(name = "Cantidad")
	private long Cantidad;
	
	@Column(name = "Quantity")
	private long Quantity;
	
	@Column(name = "Price")
	private long Price;
	
	@Column(name = "DiscPrcnt")
	private long DiscPrcnt;


}
