package com.crm.web.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crm.web.entity.ORDR;
import com.crm.web.entity.OrdrRepository;


@Service
public class OrdrImpl {
	
	@Autowired
	private OrdrRepository ordrRepository;
	
	
	/*
	 * Listar Ordenes de Compra
	 * 
	 * */
	
	public List<ORDR> findAll(){
		
		return (List<ORDR>) ordrRepository.findAll();
	}
	
	
	
	/*
	 * Servicio que permite guardar una Orden de comppra
	 */

	@Transactional()
	public void saveOrdenCompra(ORDR ordr) {
		ordrRepository.save(ordr);
	}

	@Transactional()
	public ORDR fetchByIdWithOrdencompra(int id) {

		return ordrRepository.findById(id).orElse(null);
	}

	@Transactional()
	public void deleteOrdenCompra(int id) {
		ordrRepository.deleteById(id);

	}

	@Transactional()
	public ORDR fetchByIdWhithOcrdWhithOrdrWhithOitw(int DocEntry) {

		return ordrRepository.fetchByIdWhithOcrdWhithOrdrWhithOitw(DocEntry);
	}
	
	


}
