package com.crudopertation.crudoperation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration
@EntityScan
@SpringBootApplication
class CrudoperationApplicationTests {
	public static void main(String[]args){
		SpringApplication.run(CrudoperationApplication.class, args);
	}


}
