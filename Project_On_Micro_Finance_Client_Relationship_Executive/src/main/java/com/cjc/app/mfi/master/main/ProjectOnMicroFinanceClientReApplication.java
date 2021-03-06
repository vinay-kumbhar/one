package com.cjc.app.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories
@EnableEurekaClient
@EntityScan
public class ProjectOnMicroFinanceClientReApplication {

	public static void main(String[] args) {
		
		System.out.println("Consumer_RE...!!");
		SpringApplication.run(ProjectOnMicroFinanceClientReApplication.class, args);
	}
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rest=new RestTemplate();
		return rest;
	}

}
