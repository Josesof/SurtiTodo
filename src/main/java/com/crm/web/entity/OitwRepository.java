package com.crm.web.entity;


import org.springframework.data.repository.CrudRepository;



public interface OitwRepository extends CrudRepository<OITW,Long>{

	//void finByNombre(String term);
	
	
	  //Esta consulta no se hace a nivel de base de datos, se realiza a nivel de objeto entidad
	 
	//@Query("select f from OITW f join fetch f.OITM c join fetch f.ItemName l join fetch l.OITW where f.ItemCode=?1")	
	//public List<OITW> finByNombre(String term);
	 
	

}
