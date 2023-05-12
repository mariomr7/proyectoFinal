package com.salesianostriana.dam.proyectofinal;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.proyectofinal.model.Cliente;
import com.salesianostriana.dam.proyectofinal.model.Repartidor;
import com.salesianostriana.dam.proyectofinal.model.Zona;
import com.salesianostriana.dam.proyectofinal.repos.ClienteRepositorio;
import com.salesianostriana.dam.proyectofinal.repos.RepartidorRepositorio;
import com.salesianostriana.dam.proyectofinal.repos.ZonaRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Main {
	private final ClienteRepositorio clienteRepositorio;
	private final RepartidorRepositorio repartidorRepositorio;
	private final ZonaRepositorio zonaRepositorio;

	@PostConstruct
	public void ejecutar() {

		Cliente cl1=new Cliente();
		cl1.setNombre("Mario");
		cl1.setApellidos("Macho Romero");
		cl1.setEmail("macho@gmail.com");
		
		Cliente cl2=new Cliente();
		cl2.setNombre("Pepe");
		cl2.setApellidos("Largo Carl");
		cl2.setEmail("largo@gmail.com");
		
		Cliente cl3=new Cliente();
		cl3.setNombre("Cristi");
		cl3.setApellidos("Maradona Messi");
		cl3.setEmail("maradona@gmail.com");
		
		clienteRepositorio.save(cl1);
		clienteRepositorio.save(cl2);
		clienteRepositorio.save(cl3);
		
		Zona z1=new Zona();
		z1.setNombre("Sevilla");
		
		Zona z2=new Zona();
		z2.setNombre("Cádiz");
		
		Zona z3=new Zona();
		z3.setNombre("Málaga");
		
		zonaRepositorio.save(z1);
		zonaRepositorio.save(z2);
		zonaRepositorio.save(z3);
		
		Repartidor r1=new Repartidor();
		r1.setNombre("Ezequiel");
		r1.setApellidos("Macho Alcazar");
		r1.setEmail("macho@gmail.com");
		
		Repartidor r2=new Repartidor();
		r2.setNombre("Paco");
		r2.setApellidos("Aglomerado Jimenez");
		r2.setEmail("paco@gmail.com");
		
		repartidorRepositorio.save(r1);
		repartidorRepositorio.save(r2);
		
	}
}
