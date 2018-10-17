package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerExampleApplication {
	
	private static int i = 0;

	@RequestMapping("/")
    public String home() {
        return "Hello Docker World updated";
    }
	
	@RequestMapping("/Hola")
    public String home2() {
        return "Esto es un nuevo saludo, de prueba con un cambio";
    }
	
	@RequestMapping("/Suma")
    public String suma() {
		i++;
        return "Esto es una suma " + i ;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerExampleApplication.class, args);
	}
}
