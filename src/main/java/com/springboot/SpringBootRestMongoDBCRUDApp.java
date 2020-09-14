package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//For .jar packaging
//java -jar springboot_springmvc_webapp.jar

@SpringBootApplication
//@ImportResource("classpth:app-root-config.xml") //when we are using xml based configuration with springboot.
public class SpringBootRestMongoDBCRUDApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMongoDBCRUDApp.class, args);
	}

}
