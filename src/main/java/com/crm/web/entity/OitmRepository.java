package com.crm.web.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OitmRepository extends CrudRepository<OITM, String> {

	

   
	
	
	
	//Listado de Productos
	@Query(value = " SELECT TOP 40*     FROM SURTITODO.OITM  ", nativeQuery = true)
	Collection<OITM> findAllActiveUsersNative();
	
	
	  //Buscar Producto por elm nombre
		 @Query("SELECT p FROM OITM p WHERE p.ItemName LIKE %?1%  ")
		  public List<OITM> finByNombreP(String term);


	


		

}
