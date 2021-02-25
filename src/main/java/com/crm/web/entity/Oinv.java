package com.crm.web.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "OINV")
public class Oinv  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocEntry")
	private int DocEntry;
	
	@Column(name = "CardCode")
	private String CardCode;
	
	@Column(name = "CardName")
	private String CardName;
	
	@Column(name = "DocNum")
	private int DocNum;
	
	@Column(name = "DocStatus")
	private String DocStatus;
	
	@Column(name = "DocDate")	
	private Date DocDate;
	
	@Column(name = "DocDueDate")
	private Date DocDueDate;
	
	@Column(name = "TaxDate")
	private Date TaxDate;
	
	@Column(name = "VatSum")
	private Date VatSum;
	
	@Column(name = "DiscSum")
	private double DiscSum;
	
	@Column(name = "DiscPrcnt")
	private double DiscPrcnt;
	
	@Column(name = "DocTotal")
	private double DocTotal;
	
	@Column(name = "NumAtCard")
	private String NumAtCard;
	
	@Column(name = "Comments")
	private String Comments;

	public Oinv() {
		
	}

	public Oinv(int docEntry, String cardCode, String cardName, int docNum, String docStatus, Date docDate,
			Date docDueDate, Date taxDate, Date vatSum, double discSum, double discPrcnt, double docTotal,
			String numAtCard, String comments) {
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
		NumAtCard = numAtCard;
		Comments = comments;
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

	public int getDocNum() {
		return DocNum;
	}

	public void setDocNum(int docNum) {
		DocNum = docNum;
	}

	public String getDocStatus() {
		return DocStatus;
	}

	public void setDocStatus(String docStatus) {
		DocStatus = docStatus;
	}

	public Date getDocDate() {
		return DocDate;
	}

	public void setDocDate(Date docDate) {
		DocDate = docDate;
	}

	public Date getDocDueDate() {
		return DocDueDate;
	}

	public void setDocDueDate(Date docDueDate) {
		DocDueDate = docDueDate;
	}

	public Date getTaxDate() {
		return TaxDate;
	}

	public void setTaxDate(Date taxDate) {
		TaxDate = taxDate;
	}

	public Date getVatSum() {
		return VatSum;
	}

	public void setVatSum(Date vatSum) {
		VatSum = vatSum;
	}

	public double getDiscSum() {
		return DiscSum;
	}

	public void setDiscSum(double discSum) {
		DiscSum = discSum;
	}

	public double getDiscPrcnt() {
		return DiscPrcnt;
	}

	public void setDiscPrcnt(double discPrcnt) {
		DiscPrcnt = discPrcnt;
	}

	public double getDocTotal() {
		return DocTotal;
	}

	public void setDocTotal(double docTotal) {
		DocTotal = docTotal;
	}

	public String getNumAtCard() {
		return NumAtCard;
	}

	public void setNumAtCard(String numAtCard) {
		NumAtCard = numAtCard;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

}
