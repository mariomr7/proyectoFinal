package com.salesianostriana.dam.proyectofinal.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectofinal.model.Producto;

public class ProductoController {

	@GetMapping ("/producto")
	public String showForm(Model model) {
		Producto producto = new Producto();
		model.addAttribute("productoForm",producto);
		
		return "form";
	}
	
	@PostMapping("/addProducto")
	public String submit (@ModelAttribute("productoForm")Producto producto,Model model) {
		model.addAttribute("producto",producto);
		
		return "view";
	}
}
