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

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crm.web.entity.OITM;

import com.crm.web.service.OitmImpl;

@Controller()
public class OitmController {

	

	@Autowired
	private OitmImpl OitmImplService;

	@RequestMapping(value = { "/listard" }, method = RequestMethod.GET)
	public Collection<OITM> listarR(Model model) {
		model.addAttribute("titulo", "Listado Hana");
		model.addAttribute("oItms", OitmImplService.findAll());
		return OitmImplService.findAll();

	}

	
	
	@GetMapping(value = "/cargar-productos/{term}", produces = { "application/json" })
	// Con @ResposeBody estamos suprimiendo la vista, es donde estamos guardando la
	// respuesta json
	public @ResponseBody List<OITM> cargarProductos(@PathVariable String term) {
		return OitmImplService.finByNombreP(term);
	}


	@RequestMapping(value = { "/listarttt"}, method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado Hana2");
		model.addAttribute("oItms", OitmImplService.findAllActiveUsersNative());
		return null;

	}
	
	
	

	@GetMapping(value = "/veroitm/{id}")
	public String ver(@PathVariable(value = "id") String id, Map<String, Object> model, RedirectAttributes flash) {
		OITM oitm = OitmImplService.find(id);
	

		model.put("oItm", oitm);
		model.put("titulo", "Detalle del Articulo: ");
		return null;
	}



}