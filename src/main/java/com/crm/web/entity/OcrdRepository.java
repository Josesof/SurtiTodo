package com.crm.web.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OcrdRepository extends CrudRepository<OCRD, String> {

	@Query(value = " SELECT top 40*     FROM OCRD  ", nativeQuery = true)
	Collection<OCRD> findAllActiveUsersNative();

	@org.springframework.data.jpa.repository.Modifying
	@Query(value = "INSERT INTO terceros (CardCode,CardName,GroupCode,LicTradNum,E_Mail,Phone1,AddID,SlpCode,U_HBT_RegTrib,U_HBT_TipDoc,U_HBT_MunMed,U_HBT_TipEnt\r\n"
			+ ",U_HBT_Nombres,U_HBT_Apellido1,U_HBT_Apellido2,U_HBT_Nacional,U_HBT_TipExt,U_HBT_ResFis,GroupNum,ListNum,Discount,\r\n"
			+ "CreditLine,DebtLine,U_GSP_GENDER,U_CatalogosActivos,U_CRMContrasena) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", nativeQuery = true)
	public void saveSocio(Long CardCode, String CardName, int GroupCode, String LicTradNum, String E_Mail,
			String Phone1, String AddID, int SlpCode, String U_HBT_RegTrib, String U_HBT_TipDoc, String U_HBT_MunMed,
			String U_HBT_TipEnt, String U_HBT_Nombres, String U_HBT_Apellido1, String U_HBT_Apellido2,
			String U_HBT_Nacional, String U_HBT_TipExt, String U_HBT_ResFis, long GroupNum, long ListNum,
			long Discount, long CreditLine, long DebtLine, String U_GSP_GENDER, String U_CatalogosActivos,
			String U_CRMContrasena);

	// Prueba por termino

	@Query("SELECT p FROM OCRD p WHERE p.CardCode LIKE %?1%")
	public OCRD finByCardCode(String term);

	@Query("SELECT c FROM OCRD c WHERE c.CardCode = :CardCode")
	List<OCRD> findByOcrdId(String CardCode);

	@Query("SELECT c FROM ORDR c WHERE c.CardCode = :CardCode")
	List<ORDR> findByOrdrId(String CardCode);

	@Query("select c from OCRD  c left join fetch c.ORDRS f where c.CardCode=?1")
	public OCRD fetchByIdWithOrdencompra(String CardCode);

	@Query("select c from OCRD  c left join fetch c.ORDRS f where c.CardCode=?1")
	public OCRD fetchByIdWithFacturas(String CardCode);

	// Consultar por codigo
	@Query(value = "select  top 10*   FROM OCRD  where 'CardCode' like  'CardCode' ", nativeQuery = true)
	Collection<OCRD> buscaPorCardCode(String termino);

	@Query(value = "select*" + " FROM OCRD INNER JOIN CRD1 ON" + "  OCRD.CardCode = CRD1.CardCode"
			+ "   where CardCode like  CardCode ", nativeQuery = true)
	Collection<OCRD> buscaSocio(String termino);

}
