package com.bootcamp.pomPruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoIdioma.config.SaludoProperties;
@RestController
public class IndexController {
	@Autowired  SaludoProperties s;
	
	@GetMapping("/saludo")
	public String getSaludos() {
		
		return s.getIdioma();
		
	}

}
