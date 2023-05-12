package com.salesianostriana.dam.proyectofinal.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectofinal.model.Cliente;

public class ClienteController {

	@GetMapping ("/cliente")
	public String showForm(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("clienteForm",cliente);
		return "form";
		}
	
	@PostMapping("/addCliente")
	public String submit (@ModelAttribute("clienteForm")Cliente cliente,Model model) {
		model.addAttribute("cliente",cliente);
		
		return "view";
	}
	
}