package com.bootcamp.pomPruebas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bootcamp.pomPruebas.controller.IndexController;
import com.nttdata.bootcamp.saludoIdioma.config.SaludoProperties;
import com.nttdata.bootcamp.saludoIdioma.repository.Saludo;

@SpringBootApplication
public class PomPruebasApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PomPruebasApplication.class, args);
		/*SaludoProperties properties = new SaludoProperties();
		IndexController index = new IndexController();
		Saludo saludo= new Saludo(index.getSaludos());
		System.out.println(saludo.mensajeSaludo());*/
	}

}
