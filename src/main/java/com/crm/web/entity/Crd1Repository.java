package com.crm.web.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Crd1Repository extends CrudRepository<CRD1, Long> {

	@Query(value = " SELECT TOP 30*     FROM SURTITODO.CRD1  ", nativeQuery = true)
	Collection<CRD1> findAllActiveUsersNative();
	
	
	@Query(value="SELECT p FROM SURTITODO.CRD1 p WHERE p.CardCode =:CardCode ", nativeQuery = true)
	public List<CRD1> finByCardCodeIgnoreCase();
	

}
