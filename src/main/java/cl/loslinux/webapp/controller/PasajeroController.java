package cl.loslinux.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.loslinux.webapp.model.Pasajero;
import cl.loslinux.webapp.service.PasajeroService;

@Controller
public class PasajeroController {

	
	
	@Autowired
	PasajeroService ps;
	
	@GetMapping({"/","/pasajeros"})
	public String pasajeros(Model model) {
		
		
		
		model.addAttribute("pasajeros", ps.findAll());
		
		
		return "pasajeros";
		
	}
	
	@GetMapping("/crearPasajero")
	public String crearPasajero(Model model) {
		
		Pasajero pasajero = new Pasajero();
		
		model.addAttribute("pasajero",pasajero);
		

		return "crear-pasajero";
		
	}
	
	
	@PostMapping("/crearPasajero")
	public String crearPasajero(@ModelAttribute Pasajero pasajero, Model model) {
		
		
	ps.save(pasajero);
		
		return "redirect:/pasajeros";

	}
	
	
	


}
