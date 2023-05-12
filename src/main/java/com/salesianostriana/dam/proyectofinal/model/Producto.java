package com.salesianostriana.dam.proyectofinal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Producto {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String descripcion;
	private double precio;
		
	private String tipo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate FCaducidad;

	
}
