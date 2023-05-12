package com.salesianostriana.dam.proyectofinal.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectofinal.model.Repartidor;

public class RepartidorController {

	@GetMapping ("/repartidor")
	public String showForm(Model model) {
		Repartidor repartidor=new Repartidor();
		model.addAttribute("repartidorForm",repartidor);
		
	return "form";	
	}
	
	@PostMapping("/addRepartidor")
	public String submit (@ModelAttribute("repartidorForm")Repartidor repartidor,Model model) {
		model.addAttribute("repartidor",repartidor);
		return "view";
	}
}
