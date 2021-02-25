package com.crm.web.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


//ItemFactura
@Entity(name = "RDR1")
public class RDR1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DocEntry")
	private int DocEntry;

	@Column(name = "LineNum")
	private int LineNum;

	@Column(name = "Quantity")
	private int Quantity;

	@Column(name = "Dscription")
	private String Dscription;

	@Column(name = "DiscPrcnt")
	private double DiscPrcnt;

	@Column(name = "WhsCode")
	private String WhsCode;

	@Column(name = "CodeBars")
	private String CodeBars;

	@Column(name = "UomCode")
	private String UomCode;

	@Column(name = "TaxCode")
	private String TaxCode;

	@Column(name = "ItemCode")
	private String ItemCode;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ItemCode", referencedColumnName = "ItemCode", insertable = false, updatable = false)
	private OITM oITM;

	public RDR1() {

	}

	public RDR1(int docEntry, int lineNum, int quantity, String dscription, double discPrcnt, String whsCode,
			String codeBars, String uomCode, String taxCode, String itemCode, OITM oITM) {
		super();
		DocEntry = docEntry;
		LineNum = lineNum;
		Quantity = quantity;
		Dscription = dscription;
		DiscPrcnt = discPrcnt;
		WhsCode = whsCode;
		CodeBars = codeBars;
		UomCode = uomCode;
		TaxCode = taxCode;
		ItemCode = itemCode;
		this.oITM = oITM;
	}

	public int getDocEntry() {
		return DocEntry;
	}

	public void setDocEntry(int docEntry) {
		DocEntry = docEntry;
	}

	public int getLineNum() {
		return LineNum;
	}

	public void setLineNum(int lineNum) {
		LineNum = lineNum;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getDscription() {
		return Dscription;
	}

	public void setDscription(String dscription) {
		Dscription = dscription;
	}

	public double getDiscPrcnt() {
		return DiscPrcnt;
	}

	public void setDiscPrcnt(double discPrcnt) {
		DiscPrcnt = discPrcnt;
	}

	public String getWhsCode() {
		return WhsCode;
	}

	public void setWhsCode(String whsCode) {
		WhsCode = whsCode;
	}

	public String getCodeBars() {
		return CodeBars;
	}

	public void setCodeBars(String codeBars) {
		CodeBars = codeBars;
	}

	public String getUomCode() {
		return UomCode;
	}

	public void setUomCode(String uomCode) {
		UomCode = uomCode;
	}

	public String getTaxCode() {
		return TaxCode;
	}

	public void setTaxCode(String taxCode) {
		TaxCode = taxCode;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public OITM getoITM() {
		return oITM;
	}

	public void setoITM(OITM oITM) {
		this.oITM = oITM;
	}

	public Double calcularImporte() {

		return oITM.calcularImporte();
	}

}
