package com.crm.web.entity;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface OrdrRepository  extends CrudRepository<ORDR, Integer>{
	
	@Query("select f from ORDR f join fetch f.oCRD c join fetch f.rDR1 l join fetch l.oITM where f.DocEntry=?1")	
	 public ORDR fetchByIdWhithOcrdWhithOrdrWhithOitw(int DocEntry);

	
	//@Query("SELECT c FROM OCRD c WHERE c.CardCode = :CardCode")
	//List<OCRD> findByOcrdId(String CardCode);
	//OCRD findByOcrdId(String CardCode);
	
	
	
	
	/*
	 * @Query("select f from Factura f join fetch f.cliente c join fetch f.items l join fetch l.producto where f.id=?1")
	public Factura fetchByIdWhithClienteWhithItemFacturaWhithProducto(Long id);
	 * */
	

}
