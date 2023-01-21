package com.example.apirest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apirest.model.calculoNumeroPrimo;

@RestController
public class servicioRest {
	
	@GetMapping("/")
	public String incio(){
		return "Aplicación API REST, acceda a \"/info\"";
	}
	
	@GetMapping("/info")
	public String informacion(){
		return "Prueba técnica presentada por Jhonatan Bermúdez, para el cargo de Analista de Servicios de Aplicaciones";
	}
	
	@PostMapping("/calculo")
	public String postCalculo(@RequestBody calculoNumeroPrimo calculo) {
		return calculo.calcularNumeroPrimo();
	}
	

}
