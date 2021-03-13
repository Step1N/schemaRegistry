package com.schema.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.schema")
@EnableJpaRepositories(basePackages="com.schema")
@EntityScan(basePackages="com.schema")
public class SchemaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaRegistryApplication.class, args);
	}

}
