package com.crm.web.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.crm.web.entity.OCRD;
import com.crm.web.entity.OITM;
import com.crm.web.entity.OITW;

import com.crm.web.entity.OcrdRepository;
import com.crm.web.entity.OitmRepository;

import com.crm.web.entity.OitwRepository;

@Service
public class OcrdImpl {

	@Autowired
	private OcrdRepository ocrdRepository;

	@Autowired
	private OitwRepository OitwRepository;

	@Autowired
	private OitmRepository oitmRepository;

	private JdbcTemplate jdbcTemplate;

	public Collection<OCRD> findAllActiveUsersNative() {

		return ocrdRepository.findAllActiveUsersNative();
	}

	public Collection<OCRD> buscaPorCardCode(String termino) {
		// return ocrdRepository.buscaPorCardCode(termino);
		return null;
	}

	public Collection<OCRD> buscaSocio(String termino) {
		return ocrdRepository.buscaSocio(termino);
	}

	public OCRD findByOcrdId(String CardCode) {
		return ocrdRepository.finByCardCode(CardCode);
	}

	// Metodo que permite buscar un producto por su nombre

	// oitmRepository
	public List<OITM> finByNombreP(String term) {
		return oitmRepository.finByNombreP(term);
	}

	/*
	 * @Transactional()
	 * 
	 * @Override public Cliente findOne(Long id) { // TODO Auto-generated method
	 * stub return clienteDao.findById(id).orElse(null); }
	 * 
	 * 
	 */

	@Transactional()
	public OCRD clienteId(String id) {

		return ocrdRepository.findById(id).orElse(null);

	}

	public OCRD finByCardCode(String term) {
		return ocrdRepository.finByCardCode(term);
	}

	public void saveSocio(String CardCode, String CardName, int GroupCode, String LicTradNum, String E_Mail,
			String Phone1, String AddID, int SlpCode, String U_HBT_RegTrib, String U_HBT_TipDoc, String U_HBT_MunMed,
			String U_HBT_TipEnt, String U_HBT_Nombres, String U_HBT_Apellido1, String U_HBT_Apellido2,
			String U_HBT_Nacional, String U_HBT_TipExt, String U_HBT_ResFis, int GroupNum, long ListNum, long Discount,
			long CreditLine, int DebtLine, String U_GSP_GENDER, String U_CatalogosActivos, String U_CRMContrasena,
			String Address, String City, String Country, String U_HBT_DirMM) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)

				.withProcedureName("CCU_CLIENTES_CATALOGO_CRM");

		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("CardCode", CardCode);
		inParamMap.put("CardName", CardName);
		inParamMap.put("GroupCode", GroupCode);
		inParamMap.put("LicTradNum", LicTradNum);
		inParamMap.put("E_Mail", E_Mail);
		inParamMap.put("Phone1", Phone1);
		inParamMap.put("AddID", AddID);
		inParamMap.put("SlpCode", SlpCode);
		inParamMap.put("U_HBT_RegTrib", U_HBT_RegTrib);
		inParamMap.put("U_HBT_TipDoc", U_HBT_TipDoc);
		inParamMap.put("U_HBT_MunMed", U_HBT_MunMed);
		inParamMap.put("U_HBT_TipEnt", U_HBT_TipEnt);
		inParamMap.put("U_HBT_Nombres", U_HBT_Nombres);
		inParamMap.put("U_HBT_Apellido1", U_HBT_Apellido1);
		inParamMap.put("U_HBT_Apellido2", U_HBT_Apellido2);
		inParamMap.put("U_HBT_Nacional", U_HBT_Nacional);
		inParamMap.put("U_HBT_TipExt", U_HBT_TipExt);
		inParamMap.put("U_HBT_ResFis", U_HBT_ResFis);
		inParamMap.put("GroupNum", GroupNum);
		inParamMap.put("ListNum", ListNum);
		inParamMap.put("Discount", Discount);
		inParamMap.put("CreditLine", CreditLine);
		inParamMap.put("CardName", DebtLine);
		inParamMap.put("GroupCode", U_GSP_GENDER);
		inParamMap.put("CardCode", U_CatalogosActivos);
		inParamMap.put("CardName", U_CRMContrasena);
		inParamMap.put("GroupCode", Address);
		inParamMap.put("CardCode", City);
		inParamMap.put("CardName", Country);
		inParamMap.put("GroupCode", U_HBT_DirMM);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);

		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);
		System.out.println(simpleJdbcCallResult);
	}

	/*
	 * Servicio que permite traer una producto por el nombre
	 */

	@Transactional()
	public List<OITW> finByNombre(String term) {

		// OitwRepository.finByNombre(term);

		return null;

	}

	List<OCRD> findByOcrdIdr(String CardCode) {
		return (List<OCRD>) ocrdRepository.buscaSocio(CardCode);

	}

	@Transactional()
	public OITW findProductoById(Long id) {

		return OitwRepository.findById(id).orElse(null);
	}

}
