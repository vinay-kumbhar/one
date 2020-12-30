package com.cjc.app.mfi.master.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EntityScan
@EnableJpaRepositories
public class ProjectOnMicroFinanceClientApplication {

	public static void main(String[] args) 
	{
		System.out.println("Client !!!");
		SpringApplication.run(ProjectOnMicroFinanceClientApplication.class, args);
	}

}
//Add DiscoveryClient Dependency