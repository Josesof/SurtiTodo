package com.crm.web.entity;

import org.springframework.data.repository.CrudRepository;



public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
