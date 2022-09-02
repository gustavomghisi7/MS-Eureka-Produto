package com.aulas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProdutosApplication.class, args);
	}

}
