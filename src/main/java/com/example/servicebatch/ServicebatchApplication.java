package com.example.servicebatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ServicebatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicebatchApplication.class, args);
	}

}
