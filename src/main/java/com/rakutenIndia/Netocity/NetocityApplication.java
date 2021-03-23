package com.rakutenIndia.Netocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//disable custom security feature
public class NetocityApplication {

	//Spring boot main class.
	public static void main(String[] args) {
		SpringApplication.run(NetocityApplication.class, args);
	}

}
