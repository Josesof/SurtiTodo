package com.crm.web.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "ORDR")
public class ORDR implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocEntry")
	private int DocEntry;

	@Column(name = "CardName")
	private String CardName;

	@Column(name = "DocNum")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DocNum;

	@Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DocDate")
	private Date DocDate;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "DocDueDate")
	private Date DocDueDate;

	@Column(name = "CardCode")
	private String CardCode;

	@Column(name = "DocStatus")
	private String DocStatus;

	@Column(name = "Comments")
	private String Comments;

	@Column(name = "DiscSum")
	private double DiscSum;

	@Column(name = "DocTotal")
	private double DocTotal;

	@Column(name = "Series")
	private int Series;

	@Column(name = "NumAtCard")
	private String NumAtCard;

	@ManyToOne(fetch = FetchType.LAZY)
	private OCRD oCRD;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "DocEntry", referencedColumnName = "DocEntry", insertable = false, updatable = false)
	private List<RDR1> rDR1;

	public ORDR() {
		this.rDR1 = new ArrayList<RDR1>();
	}

	public ORDR(int docEntry, String cardName, Date docNum, Date docDate, Date docDueDate, String cardCode,
			String docStatus, String comments, double discSum, double docTotal, int series, String numAtCard, OCRD oCRD,
			List<RDR1> rDR1) {
		super();
		DocEntry = docEntry;
		CardName = cardName;
		DocNum = docNum;
		DocDate = docDate;
		DocDueDate = docDueDate;
		CardCode = cardCode;
		DocStatus = docStatus;
		Comments = comments;
		DiscSum = discSum;
		DocTotal = docTotal;
		Series = series;
		NumAtCard = numAtCard;
		this.oCRD = oCRD;
		this.rDR1 = rDR1;
	}

	public int getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(int docEntry) {
		DocEntry = docEntry;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public Date getDocNum() {
		return DocNum;
	}

	public void setDocNum(Date docNum) {
		DocNum = docNum;
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

	public String getCardCode() {
		return CardCode;
	}

	public void setCardCode(String cardCode) {
		CardCode = cardCode;
	}

	public String getDocStatus() {
		return DocStatus;
	}

	public void setDocStatus(String docStatus) {
		DocStatus = docStatus;
	}

	public String getComments() {
		return Comments;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public double getDiscSum() {
		return DiscSum;
	}

	public void setDiscSum(double discSum) {
		DiscSum = discSum;
	}

	public double getDocTotal() {

		return DocTotal;
	}

	public void setDocTotal(double docTotal) {
		DocTotal = docTotal;
	}

	public int getSeries() {
		return Series;
	}

	public void setSeries(int series) {
		Series = series;
	}

	public String getNumAtCard() {
		return NumAtCard;
	}

	public void setNumAtCard(String numAtCard) {
		NumAtCard = numAtCard;
	}

	public OCRD getoCRD() {
		return oCRD;
	}

	public void setoCRD(OCRD oCRD) {
		this.oCRD = oCRD;
	}

	public List<RDR1> getItems() {
		return rDR1;
	}

	public void setItems(List<RDR1> rDR1) {
		this.rDR1 = rDR1;
	}

	public void addItemRdr1(RDR1 rdr1) {
		this.rDR1.add(rdr1);
	}

	public Double getTotal() {
		Double total = 0.0;
		int size = rDR1.size();
		for (int i = 0; i < size; i++) {
			total += rDR1.get(i).calcularImporte();
		}

		return total;

	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
