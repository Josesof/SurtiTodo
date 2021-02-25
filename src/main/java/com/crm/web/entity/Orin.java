package com.crm.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ORIN")
public class Orin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocEntry")
	private int DocEntry;
	
	@Column(name = "CardCode")
	private String CardCode;
	
	@Column(name = "CardName")
	private String CardName;
	
	@Column(name = "DocNum")
	private String DocNum;
	
	@Column(name = "DocStatus")
	private String DocStatus;
	
	@Column(name = "DocDate")
	private String DocDate;
	
	@Column(name = "DocDueDate")
	private String DocDueDate;
	
	@Column(name = "TaxDate")
	private String TaxDate;
	
	@Column(name = "VatSum")
	private String VatSum;
	
	@Column(name = "DiscSum")
	private String DiscSum;
	
	@Column(name = "DiscPrcnt")
	private String DiscPrcnt;
	
	@Column(name = "DocTotal")
	private String DocTotal;

	public Orin() {
		
	}

	public Orin(int docEntry, String cardCode, String cardName, String docNum, String docStatus, String docDate,
			String docDueDate, String taxDate, String vatSum, String discSum, String discPrcnt, String docTotal) {
		super();
		DocEntry = docEntry;
		CardCode = cardCode;
		CardName = cardName;
		DocNum = docNum;
		DocStatus = docStatus;
		DocDate = docDate;
		DocDueDate = docDueDate;
		TaxDate = taxDate;
		VatSum = vatSum;
		DiscSum = discSum;
		DiscPrcnt = discPrcnt;
		DocTotal = docTotal;
	}

	public int getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(int docEntry) {
		DocEntry = docEntry;
	}

	public String getCardCode() {
		return CardCode;
	}

	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public String getDocNum() {
		return DocNum;
	}

	public void setDocNum(String docNum) {
		DocNum = docNum;
	}

	public String getDocStatus() {
		return DocStatus;
	}

	public void setDocStatus(String docStatus) {
		DocStatus = docStatus;
	}

	public String getDocDate() {
		return DocDate;
	}

	public void setDocDate(String docDate) {
		DocDate = docDate;
	}

	public String getDocDueDate() {
		return DocDueDate;
	}

	public void setDocDueDate(String docDueDate) {
		DocDueDate = docDueDate;
	}

	public String getTaxDate() {
		return TaxDate;
	}

	public void setTaxDate(String taxDate) {
		TaxDate = taxDate;
	}

	public String getVatSum() {
		return VatSum;
	}

	public void setVatSum(String vatSum) {
		VatSum = vatSum;
	}

	public String getDiscSum() {
		return DiscSum;
	}

	public void setDiscSum(String discSum) {
		DiscSum = discSum;
	}

	public String getDiscPrcnt() {
		return DiscPrcnt;
	}

	public void setDiscPrcnt(String discPrcnt) {
		DiscPrcnt = discPrcnt;
	}

	public String getDocTotal() {
		return DocTotal;
	}

	public void setDocTotal(String docTotal) {
		DocTotal = docTotal;
	}

	


	
}
