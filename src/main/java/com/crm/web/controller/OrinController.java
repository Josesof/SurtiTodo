package com.crm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class OrinController {
	
	@Autowired
	//private OrinImpl orinImpl;
	
	@RequestMapping(value = {"movimientonegocios" }, method = RequestMethod.GET)
	public String movimientonegocios() {
		
		return "movimientonegocios";

	}

}
