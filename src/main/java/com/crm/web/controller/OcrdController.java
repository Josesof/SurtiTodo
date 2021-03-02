package com.crm.web.controller;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crm.web.entity.CRD1;
import com.crm.web.entity.OCRD;

import com.crm.web.service.OcrdImpl;

@Controller
public class OcrdController {

	@Autowired
	private OcrdImpl ocrdImpl;

	@RequestMapping(value = { "listar" }, method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Lista Socios");
		model.addAttribute("ocrds", ocrdImpl.findAllActiveUsersNative());
		return "listar"; // ocrdImpl.findAllActiveUsersNative();

	}

	List<OCRD> findByOcrdId(String CardCode) {
		return (List<OCRD>) ocrdImpl.buscaSocio(CardCode);

	}

	@RequestMapping(value = "/datosmaestros", method = RequestMethod.GET)
	public String crear(@RequestParam(value = "CardCode", required = false) String CardCode,
			@RequestParam(value = "CardName", required = false) String CardName,
			@RequestParam(value = "GroupCode", required = false) String GroupCode,
			@RequestParam(value = "LicTradNum", required = false) String LicTradNum,
			@RequestParam(value = "E_Mail", required = false) String E_Mail,
			@RequestParam(value = "Phone1", required = false) String Phone1,
			@RequestParam(value = "AddID", required = false) String AddID,
			@RequestParam(value = "SlpCode", required = false) String SlpCode,
			@RequestParam(value = "U_HBT_RegTrib", required = false) String U_HBT_RegTrib,
			@RequestParam(value = "U_HBT_TipDoc", required = false) String U_HBT_TipDoc,
			@RequestParam(value = "U_HBT_MunMed", required = false) String U_HBT_MunMed,
			@RequestParam(value = "U_HBT_TipEnt", required = false) String U_HBT_TipEnt,
			@RequestParam(value = "U_HBT_Nombres", required = false) String U_HBT_Nombres,
			@RequestParam(value = "U_HBT_Apellido1", required = false) String U_HBT_Apellido1,
			@RequestParam(value = "U_HBT_Apellido2", required = false) String U_HBT_Apellido2,
			@RequestParam(value = "U_HBT_Nacional", required = false) String U_HBT_Nacional,
			@RequestParam(value = "U_HBT_TipExt", required = false) String U_HBT_TipExt,
			@RequestParam(value = "U_HBT_ResFis", required = false) String U_HBT_ResFis,
			@RequestParam(value = "GroupNum", required = false) Long GroupNum,
			@RequestParam(value = "ListNum", required = false) Long ListNum,
			@RequestParam(value = "Discount", required = false) Long Discount,
			@RequestParam(value = "CreditLine", required = false) Long CreditLine,
			@RequestParam(value = "DebtLine", required = false) Long DebtLine,
			@RequestParam(value = "U_GSP_GENDER", required = false) String U_GSP_GENDER,
			@RequestParam(value = "U_CatalogosActivos", required = false) String U_CatalogosActivos,
			@RequestParam(value = "U_CRMContrasena", required = false) String U_CRMContrasena,
			@RequestParam(value = "Address", required = false) String Address,
			@RequestParam(value = "City", required = false) String City,
			@RequestParam(value = "Country", required = false) String Country,
			@RequestParam(value = "U_HBT_DirMM", required = false) String U_HBT_DirMM, Model model,
			RedirectAttributes flash) {

		OCRD ocrd = new OCRD();

		ocrd.getCardCode();
		ocrd.getCardName();
		ocrd.getGroupCode();
		ocrd.getLicTradNum();
		ocrd.getE_Mail();
		ocrd.getPhone1();
		ocrd.getAddID();
		ocrd.getSlpCode();
		ocrd.getU_HBT_RegTrib();
		ocrd.getU_HBT_TipDoc();
		ocrd.getU_HBT_MunMed();
		ocrd.getU_HBT_TipEnt();
		ocrd.getU_HBT_Nombres();
		ocrd.getU_HBT_Apellido1();
		ocrd.getU_HBT_Apellido2();
		ocrd.getU_HBT_Nacional();
		ocrd.getU_HBT_TipExt();
		ocrd.getU_HBT_ResFis();
		ocrd.getGroupNum();
		ocrd.getListNum();
		ocrd.getDiscount();
		ocrd.getCreditLine();
		ocrd.getDebtLine();
		ocrd.getU_GSP_GENDER();
		ocrd.getU_CatalogosActivos();
		ocrd.getU_CRMContrasena();

		System.out.print("Este servicio si esta funcionando soy un GET");
		model.addAttribute("ocrd", ocrd);

		return "datosmaestros";
	}
	
	
	
	

	@RequestMapping(value = "/datosmaestros", method = RequestMethod.POST)

	public String guardar(@Valid @ModelAttribute("ocrd") OCRD ocrd, BindingResult result, RedirectAttributes flash,
			Model model) {
		ocrdImpl.save(ocrd);
		flash.addFlashAttribute("success", "Cliente creado con exito");

		return "listar";
	}

	@RequestMapping(value = "/datosmaestrosssss", method = RequestMethod.POST)
	public String insertardata(@RequestParam(value = "CardCode", required = false) String CardCode,
			@RequestParam(value = "CardName", required = false) String CardName,
			@RequestParam(value = "GroupCode", required = false) Integer GroupCode,
			@RequestParam(value = "LicTradNum", required = false) String LicTradNum,
			@RequestParam(value = "E_Mail", required = false) String E_Mail,
			@RequestParam(value = "Phone1", required = false) String Phone1,
			@RequestParam(value = "AddID", required = false) String AddID,
			@RequestParam(value = "SlpCode", required = false) Integer SlpCode,
			@RequestParam(value = "U_HBT_RegTrib", required = false) String U_HBT_RegTrib,
			@RequestParam(value = "U_HBT_TipDoc", required = false) String U_HBT_TipDoc,
			@RequestParam(value = "U_HBT_MunMed", required = false) String U_HBT_MunMed,
			@RequestParam(value = "U_HBT_TipEnt", required = false) String U_HBT_TipEnt,
			@RequestParam(value = "U_HBT_Nombres", required = false) String U_HBT_Nombres,
			@RequestParam(value = "U_HBT_Apellido1", required = false) String U_HBT_Apellido1,
			@RequestParam(value = "U_HBT_Apellido2", required = false) String U_HBT_Apellido2,
			@RequestParam(value = "U_HBT_Nacional", required = false) String U_HBT_Nacional,
			@RequestParam(value = "U_HBT_TipExt", required = false) String U_HBT_TipExt,
			@RequestParam(value = "U_HBT_ResFis", required = false) String U_HBT_ResFis,
			@RequestParam(value = "GroupNum", required = false) Integer GroupNum,
			@RequestParam(value = "ListNum", required = false) Integer ListNum,
			@RequestParam(value = "Discount", required = false) Integer Discount,
			@RequestParam(value = "CreditLine", required = false) Integer CreditLine,
			@RequestParam(value = "DebtLine", required = false) Integer DebtLine,
			@RequestParam(value = "U_GSP_GENDER", required = false) String U_GSP_GENDER,
			@RequestParam(value = "U_CatalogosActivos", required = false) String U_CatalogosActivos,
			@RequestParam(value = "U_CRMContrasena", required = false) String U_CRMContrasena, Model model,
			RedirectAttributes flash) {

		try {

			OCRD ocrd = new OCRD();
			// CRD1 crd1 = new CRD1();

			ocrd.setCardCode(CardCode);
			ocrd.setCardName(CardName);
			ocrd.setGroupCode(GroupCode);
			ocrd.setLicTradNum(LicTradNum);
			ocrd.setE_Mail(E_Mail);
			ocrd.setPhone1(Phone1);
			ocrd.setAddID(AddID);
			ocrd.setSlpCode(SlpCode);
			ocrd.setU_HBT_RegTrib(U_HBT_RegTrib);
			ocrd.setU_HBT_TipDoc(U_HBT_TipDoc);
			ocrd.setU_HBT_MunMed(U_HBT_MunMed);
			ocrd.setU_HBT_TipEnt(U_HBT_TipEnt);
			ocrd.setU_HBT_Nombres(U_HBT_Nombres);
			ocrd.setU_HBT_Apellido1(U_HBT_Apellido1);
			ocrd.setU_HBT_Apellido2(U_HBT_Apellido2);
			ocrd.setU_HBT_Nacional(U_HBT_Nacional);
			ocrd.setU_HBT_TipExt(U_HBT_TipExt);
			ocrd.setU_HBT_ResFis(U_HBT_ResFis);
			ocrd.setGroupNum(GroupNum);
			ocrd.setListNum(ListNum);
			ocrd.setDiscount(Discount);
			ocrd.setCreditLine(CreditLine);
			ocrd.setDebtLine(DebtLine);
			ocrd.setU_GSP_GENDER(U_GSP_GENDER);
			ocrd.setU_CatalogosActivos(U_CatalogosActivos);
			ocrd.setU_CRMContrasena(U_CRMContrasena);

			ocrdImpl.saveSocio(CardCode, CardName, GroupCode, LicTradNum, E_Mail, Phone1, AddID, SlpCode, U_HBT_RegTrib,
					U_HBT_TipDoc, U_HBT_MunMed, U_HBT_TipEnt, U_HBT_Nombres, U_HBT_Apellido1, U_HBT_Apellido2,
					U_HBT_Nacional, U_HBT_TipExt, U_HBT_ResFis, GroupCode, ListNum, Discount, CreditLine, SlpCode,
					U_GSP_GENDER, U_CatalogosActivos, U_CRMContrasena);

			System.out.print("Este servicio si esta funcionando soy un POST");
		} catch (Exception e) {

			flash.addFlashAttribute("error", "No se creo el cliente correctamente");
		}
		return "datosmaestros";
	}

	// Metodo que permite crear un socio.

	/*
	 * @GetMapping(value = "/buscar/{termino}") public Collection<OCRD>
	 * buscar(@RequestParam(name = "termino", required = false) String termino,
	 * Model model, RedirectAttributes flash) { return
	 * ocrdImpl.buscaPorCardCode(termino);
	 * 
	 * }
	 * 
	 */

	@GetMapping(value = "/buscarSocio/{termino}")
	public Collection<OCRD> buscarSocio(@RequestParam(name = "termino", required = false) String termino, Model model,
			RedirectAttributes flash) {
		return ocrdImpl.buscaSocio(termino);

	}
	
	@GetMapping(value = "BusinessPartners")
	public String listaSocios() {
		return ocrdImpl.findAllOcrds();

	}
	
	

}
