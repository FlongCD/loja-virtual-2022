package com.flong.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flong.backend.entity.Pessoa;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);

		Pessoa p = new Pessoa();
		p.setCpf("11111111111");
	}

}
