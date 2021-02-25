package com.crm.web.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crm.web.entity.CRD1;

import com.crm.web.service.Crd1Impl;


@Controller

class Crd1Controller {

	@Autowired
	private Crd1Impl crd1Impl;
	
	
	
	@RequestMapping(value = {"index", "" , "/" }, method = RequestMethod.GET)
	public String index() {
		
		return "index";

	}
	
	
	

	@RequestMapping(value = { "liscrd1" }, method = RequestMethod.GET)
	public Collection<CRD1> listars(Model model) {
		// model.addAttribute("titulo", "Listado Hana2");
		// model.addAttribute("oItms", crd1Impl.findAllActiveUsersNative());
		return crd1Impl.findAllActiveUsersNative();

	}

	
	@GetMapping(value = "/vercrd1/{id}")
	public List<CRD1> ver(@PathVariable(value = "id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		
		
		//return crd1Impl.finByCardCode(id);
		return null;
	}


}
