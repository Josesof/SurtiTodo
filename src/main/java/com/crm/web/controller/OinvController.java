package com.crm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OinvController {
	
	@Autowired
	//private OrinImpl orinImpl;
	
	@RequestMapping(value = {"movimientonegocioss" }, method = RequestMethod.GET)
	public String movimientonegocioss() {
		
		return "movimientonegocios";

	}
	
	
	
	@RequestMapping(value = {"consultarfactura" }, method = RequestMethod.GET)
	public String consultarfactura() {
		
		return "consultarfactura";

	}

}
