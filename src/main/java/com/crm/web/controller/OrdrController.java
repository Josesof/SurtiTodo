package com.crm.web.controller;


import java.util.Collection;
import java.util.List;
import java.util.Map;



import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crm.web.entity.OCRD;
import com.crm.web.entity.OITM;
import com.crm.web.entity.ORDR;
import com.crm.web.entity.RDR1;
import com.crm.web.service.OcrdImpl;
import com.crm.web.service.OitmImpl;
import com.crm.web.service.OrdrImpl;



@Controller
@SessionAttributes("ordencompra")
public class OrdrController {

	private final Logger log = LoggerFactory.getLogger(getClass());

	/* Inyeccion de clientes */
	@Autowired
	private OcrdImpl ocrdImpl;

	/* Inyeccuin Ordenes de compra */

	@Autowired
	private OrdrImpl ordrImpl;

	/* Inyecion productos OITM */
	@Autowired
	private OitmImpl OitmImplService;

	/*
	 * Listar Ordenes de compras
	 */

	@RequestMapping(value = { "/listOrd" }, method = RequestMethod.GET)
	public List<ORDR> ListOrd(Model model) {
		model.addAttribute("titulo", "Lista Ordenes de Compra");
		model.addAttribute("ordr", ordrImpl.findAll());
		return ordrImpl.findAll();
	}

	/*
	 * 
	 * Metodo que me permite crear una orden por cliente.
	 * 
	 */
	@GetMapping("/ver/{clienteId}")
	public String crear(@PathVariable(value = "clienteId") String clienteId, Map<String, Object> model,
			RedirectAttributes flash, SessionStatus status) {
		OCRD ocrd = ocrdImpl.clienteId(clienteId);
		if (ocrd == null) {
			flash.addFlashAttribute("error", "El cliente no tiene facturas asociadas");
			return "redirect:/listar";
		}
		ORDR ordr = new ORDR();
		ordr.setoCRD(ocrd);
		status.setComplete();
		model.put("ordencompra", ordr);
		model.put("titulo", "Crear factura");
		return "factura/carrito";

	}

	// Get Formulario Carrito de compra

	@GetMapping("/carrito/{clienteId}")
	public String crearOrden(@PathVariable(value = "clienteId") String clienteId, Map<String, Object> model,
			RedirectAttributes flash) {

		OCRD ocrd = ocrdImpl.findByOcrdId(clienteId);
		if (ocrd == null) {
			flash.addFlashAttribute("error", "El no existe en la base de datos");
			return "redirect:/listar";
		}

		ORDR ordr = new ORDR();
		ordr.setoCRD(ocrd);

		model.put("ordencompra", ordr);
		model.put("titulo", "Crear factura");
		return "factura/carrito";
	}

	@PostMapping("/carrito")
	public String savaOrdenCompra(@Valid ORDR ordencompra, BindingResult result, Model model,
			@RequestParam(name = "item_id[]", required = false) String[] itemId,
			@RequestParam(name = "cantidad[]", required = false) Integer[] cantidad, RedirectAttributes flash,
			SessionStatus status) {
        /*
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Carrito de Compras");
			return "listar";
		}*/

		if (itemId == null || itemId.length == 0) {
			model.addAttribute("titulo", "Crear Orden");
			model.addAttribute("error", "La factura no puede no tener lineas!");
			return "factura/carrito";
		}

		for (int i = 0; i < itemId.length; i++) {
			OITM oitm = OitmImplService.find(itemId[i]);
			//find(itemId[i]);

			RDR1 linea = new RDR1();
			linea.setQuantity(cantidad[i]);
			linea.setoITM(oitm);
			ordencompra.addItemRdr1(linea);
			log.info("ID" + itemId[i] + ", cantida " + cantidad[i]);
		}
		ordrImpl.saveOrdenCompra(ordencompra);
		status.setComplete();
		flash.addFlashAttribute("success", "Orden creada con exito");

		return "ordencompra"; //+ ordencompra.getoCRD().getCardName();

	}

	/*
	 * Medodo que permite consultar ordenes de compra.
	 */
	@RequestMapping(value = { "/orden" }, method = RequestMethod.GET)
	public String listar(Model model) {

		model.addAttribute("titulo", "Lista Socios");
		model.addAttribute("ocrds", ocrdImpl.findAllActiveUsersNative());
		return "listar"; // ocrdImpl.findAllActiveUsersNative();

	}

	/*
	 * Metodo que permite actualizar todos los datos
	 */
	@RequestMapping(value = { "actualizacionmasivaRT" }, method = RequestMethod.POST)
	public String actualizacionmasivaf() {

		return "actualizacionmasiva";

	}

	@RequestMapping(value = { "actualizacionmasivaHHH" }, method = RequestMethod.POST)
	public String actualizacionmasiva() {

		return "actualizacionmasiva";

	}

	/*
	 * Metodo que permite consultar la lista de socios.
	 */
	@RequestMapping(value = { "ordencompra" }, method = RequestMethod.GET)
	public Collection<OCRD> ordencompra(Model model) {
		model.addAttribute("titulo", "Lista Socios");
		model.addAttribute("ocrds", ocrdImpl.findAllActiveUsersNative());
		return ocrdImpl.findAllActiveUsersNative();

	}

}
