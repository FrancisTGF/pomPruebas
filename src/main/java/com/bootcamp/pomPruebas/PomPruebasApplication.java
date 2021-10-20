package com.bootcamp.pomPruebas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
