package com.salesianostriana.dam.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Repartidor {
	@Id
	@GeneratedValue
	private Long id;
	
	

	private String nombre,apellidos,email;
	/*
	@ManyToOne
	@JoinColumn(foreignKey=@ForeignKey(name="fk_repartidor_zona"))
	private Zona zona;
	
	public void addToZona(Zona zona) {
		this.zona=zona;
		zona.getRepartidores().add(this);
	}*/
}
