package cl.loslinux.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.loslinux.webapp.model.Destino;
import cl.loslinux.webapp.service.DestinoService;
import cl.loslinux.webapp.service.PasajeroService;

@Controller
public class DestinoController {

	
	
	@Autowired
	DestinoService ds;
	
	@Autowired
	PasajeroService ps;
	
	@GetMapping("/destinos")
	public String destinos(Model model) {
		
		
		model.addAttribute("destinos",ds.findAll());
		
		
		return "destinos";
		
	}
	
	@GetMapping("/crearDestino")
	public String crearDestino(Model model) {
		
		Destino destino = new Destino();
		
		model.addAttribute("destino",destino);
		model.addAttribute("pasajeros", ps.findAll());



		return "crear-destino";
		
	}
	
	@PostMapping("/crearDestino")
	public String crearDestino(@ModelAttribute Destino destino, Model model) {
		
		
	ds.save(destino);
		
		return "redirect:/";

	}
	
	

	
	
	
	
}
