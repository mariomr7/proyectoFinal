package com.salesianostriana.dam.proyectofinal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Zona {
	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
/*
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="curso",fetch=FetchType.EAGER)
	@Builder.Default
	
	private List<Repartidor> repartidores=new ArrayList<>();
	*/
}
