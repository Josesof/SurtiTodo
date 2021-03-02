package com.crm.web.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true )
@Entity(name = "OCRD")
public class OCRD implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "CardCode",nullable = false, length= 255)	
	private String CardCode;	
	

	@Column(name = "CardName")
	private String CardName;

	@Column(name = "GroupCode")
	private int GroupCode;

	@Column(name = "LicTradNum")
	private String LicTradNum;

	@Column(name = "E_Mail")
	private String E_Mail;

	@Column(name = "Phone1")
	private String Phone1;

	@Column(name = "AddID")
	private String AddID;

	@Column(name = "SlpCode")
	private int SlpCode;

	@Column(name = "U_HBT_RegTrib")
	private String U_HBT_RegTrib;

	@Column(name = "U_HBT_TipDoc")
	private String U_HBT_TipDoc;

	@Column(name = "U_HBT_MunMed")
	private String U_HBT_MunMed;

	@Column(name = "U_HBT_TipEnt")
	private String U_HBT_TipEnt;

	@Column(name = "U_HBT_Nombres")
	private String U_HBT_Nombres;

	@Column(name = "U_HBT_Apellido1")
	private String U_HBT_Apellido1;

	@Column(name = "U_HBT_Apellido2")
	private String U_HBT_Apellido2;

	@Column(name = "U_HBT_Nacional")
	private String U_HBT_Nacional;

	@Column(name = "U_HBT_TipExt")
	private String U_HBT_TipExt;

	@Column(name = "U_HBT_ResFis")
	private String U_HBT_ResFis;

	@Column(name = "GroupNum")
	private long GroupNum;

	@Column(name = "ListNum")
	private long ListNum;

	@Column(name = "Discount")
	private long Discount;

	@Column(name = "CreditLine")
	private long CreditLine;

	@Column(name = "DebtLine")
	private long DebtLine;

	@Column(name = "U_GSP_GENDER")
	private String U_GSP_GENDER;

	@Column(name = "U_CatalogosActivos")
	private String U_CatalogosActivos;

	@Column(name = "U_CRMContrasena")
	private String U_CRMContrasena;

	// orphanRemoval = true sirve para borrar registros huerfanos
	// @OneToMany(mappedBy = "OCRD", fetch = FetchType.LAZY, cascade =
	// CascadeType.ALL, orphanRemoval = true)
	// mappedBy="oCRD"
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "CardCode")
	private List<ORDR> ORDRS;

	public OCRD() {
		ORDRS = new ArrayList<ORDR>();
	}

	public OCRD(String cardCode, String cardName, int groupCode, String licTradNum, String e_Mail, String phone1,
			String addID, int slpCode, String u_HBT_RegTrib, String u_HBT_TipDoc, String u_HBT_MunMed,
			String u_HBT_TipEnt, String u_HBT_Nombres, String u_HBT_Apellido1, String u_HBT_Apellido2,
			String u_HBT_Nacional, String u_HBT_TipExt, String u_HBT_ResFis, long groupNum, long listNum,
			long discount, long creditLine, long debtLine, String u_GSP_GENDER, String u_CatalogosActivos,
			String u_CRMContrasena, CRD1 crd1, List<ORDR> oRDRS) {
		super();
		CardCode = cardCode;
		CardName = cardName;
		GroupCode = groupCode;
		LicTradNum = licTradNum;
		E_Mail = e_Mail;
		Phone1 = phone1;
		AddID = addID;
		SlpCode = slpCode;
		U_HBT_RegTrib = u_HBT_RegTrib;
		U_HBT_TipDoc = u_HBT_TipDoc;
		U_HBT_MunMed = u_HBT_MunMed;
		U_HBT_TipEnt = u_HBT_TipEnt;
		U_HBT_Nombres = u_HBT_Nombres;
		U_HBT_Apellido1 = u_HBT_Apellido1;
		U_HBT_Apellido2 = u_HBT_Apellido2;
		U_HBT_Nacional = u_HBT_Nacional;
		U_HBT_TipExt = u_HBT_TipExt;
		U_HBT_ResFis = u_HBT_ResFis;
		GroupNum = groupNum;
		ListNum = listNum;
		Discount = discount;
		CreditLine = creditLine;
		DebtLine = debtLine;
		U_GSP_GENDER = u_GSP_GENDER;
		U_CatalogosActivos = u_CatalogosActivos;
		U_CRMContrasena = u_CRMContrasena;

		ORDRS = oRDRS;
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

	public int getGroupCode() {
		return GroupCode;
	}

	public void setGroupCode(int groupCode) {
		GroupCode = groupCode;
	}

	public String getLicTradNum() {
		return LicTradNum;
	}

	public void setLicTradNum(String licTradNum) {
		LicTradNum = licTradNum;
	}

	public String getE_Mail() {
		return E_Mail;
	}

	public void setE_Mail(String e_Mail) {
		E_Mail = e_Mail;
	}

	public String getPhone1() {
		return Phone1;
	}

	public void setPhone1(String phone1) {
		Phone1 = phone1;
	}

	public String getAddID() {
		return AddID;
	}

	public void setAddID(String addID) {
		AddID = addID;
	}

	public int getSlpCode() {
		return SlpCode;
	}

	public void setSlpCode(int slpCode) {
		SlpCode = slpCode;
	}

	public String getU_HBT_RegTrib() {
		return U_HBT_RegTrib;
	}

	public void setU_HBT_RegTrib(String u_HBT_RegTrib) {
		U_HBT_RegTrib = u_HBT_RegTrib;
	}

	public String getU_HBT_TipDoc() {
		return U_HBT_TipDoc;
	}

	public void setU_HBT_TipDoc(String u_HBT_TipDoc) {
		U_HBT_TipDoc = u_HBT_TipDoc;
	}

	public String getU_HBT_MunMed() {
		return U_HBT_MunMed;
	}

	public void setU_HBT_MunMed(String u_HBT_MunMed) {
		U_HBT_MunMed = u_HBT_MunMed;
	}

	public String getU_HBT_TipEnt() {
		return U_HBT_TipEnt;
	}

	public void setU_HBT_TipEnt(String u_HBT_TipEnt) {
		U_HBT_TipEnt = u_HBT_TipEnt;
	}

	public String getU_HBT_Nombres() {
		return U_HBT_Nombres;
	}

	public void setU_HBT_Nombres(String u_HBT_Nombres) {
		U_HBT_Nombres = u_HBT_Nombres;
	}

	public String getU_HBT_Apellido1() {
		return U_HBT_Apellido1;
	}

	public void setU_HBT_Apellido1(String u_HBT_Apellido1) {
		U_HBT_Apellido1 = u_HBT_Apellido1;
	}

	public String getU_HBT_Apellido2() {
		return U_HBT_Apellido2;
	}

	public void setU_HBT_Apellido2(String u_HBT_Apellido2) {
		U_HBT_Apellido2 = u_HBT_Apellido2;
	}

	public String getU_HBT_Nacional() {
		return U_HBT_Nacional;
	}

	public void setU_HBT_Nacional(String u_HBT_Nacional) {
		U_HBT_Nacional = u_HBT_Nacional;
	}

	public String getU_HBT_TipExt() {
		return U_HBT_TipExt;
	}

	public void setU_HBT_TipExt(String u_HBT_TipExt) {
		U_HBT_TipExt = u_HBT_TipExt;
	}

	public String getU_HBT_ResFis() {
		return U_HBT_ResFis;
	}

	public void setU_HBT_ResFis(String u_HBT_ResFis) {
		U_HBT_ResFis = u_HBT_ResFis;
	}

	public long getGroupNum() {
		return GroupNum;
	}

	public void setGroupNum(long groupNum) {
		GroupNum = groupNum;
	}

	public long getListNum() {
		return ListNum;
	}

	public void setListNum(long listNum) {
		ListNum = listNum;
	}

	public long getDiscount() {
		return Discount;
	}

	public void setDiscount(long discount) {
		Discount = discount;
	}

	public long getCreditLine() {
		return CreditLine;
	}

	public void setCreditLine(long creditLine) {
		CreditLine = creditLine;
	}

	public long getDebtLine() {
		return DebtLine;
	}

	public void setDebtLine(long debtLine) {
		DebtLine = debtLine;
	}

	public String getU_GSP_GENDER() {
		return U_GSP_GENDER;
	}

	public void setU_GSP_GENDER(String u_GSP_GENDER) {
		U_GSP_GENDER = u_GSP_GENDER;
	}

	public String getU_CatalogosActivos() {
		return U_CatalogosActivos;
	}

	public void setU_CatalogosActivos(String u_CatalogosActivos) {
		U_CatalogosActivos = u_CatalogosActivos;
	}

	public String getU_CRMContrasena() {
		return U_CRMContrasena;
	}

	public void setU_CRMContrasena(String u_CRMContrasena) {
		U_CRMContrasena = u_CRMContrasena;
	}

	public List<ORDR> getORDRS() {
		return ORDRS;
	}

	public void setORDRS(List<ORDR> oRDRS) {
		ORDRS = oRDRS;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addORDR(ORDR oRDR) {
		ORDRS.add(oRDR);
	}

}
