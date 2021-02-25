package com.crm.web.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.crm.web.entity.CRD1;
import com.crm.web.entity.Crd1Repository;


@Service
public class Crd1Impl  {
	
	//private JdbcTemplate jdbcTemplate;

	@Autowired
	private Crd1Repository crd1Repository;

	public Collection<CRD1> findAllActiveUsersNative() {

		return crd1Repository.findAllActiveUsersNative();
	}

	 public List<CRD1> finByCardCode(Long id){
		return  crd1Repository.finByCardCodeIgnoreCase();
	}
	 
	
	

	
	
	
}
