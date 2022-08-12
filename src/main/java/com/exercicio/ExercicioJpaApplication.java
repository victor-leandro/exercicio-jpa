package com.exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.exercicio.domain")
@SpringBootApplication
public class ExercicioJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExercicioJpaApplication.class, args);
	}
}
