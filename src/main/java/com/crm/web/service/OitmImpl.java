package com.crm.web.service;

import java.util.Collection;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.web.entity.OITM;
import com.crm.web.entity.OitmRepository;

@Service
public class OitmImpl {

	@Autowired
	private OitmRepository oItmDao;
	
	/*
	 * Servicio que permite consultar la lista de productos
	 */
	


	public Collection<OITM> findAll() {

		return (List<OITM>) oItmDao.findAll();
	}
	
	

	/*
	 * Servicio que permite consultar un producto por su id
	 */
	@Transactional()
	public OITM find(String id) {
		return oItmDao.findById(id).orElse(null);
	}
	
	
	/*
	 * Servicio que permite consultar un producto por termino de busqueda
	 */
	
	 
	 public List<OITM> finByNombreP(String term){
		 return  oItmDao.finByNombreP(term);
	 }
	

	public Collection<OITM> findAllActiveUsersNative() {

		return oItmDao.findAllActiveUsersNative();
	}

}