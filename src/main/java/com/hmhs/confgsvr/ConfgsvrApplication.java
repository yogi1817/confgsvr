package com.hmhs.confgsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfgsvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfgsvrApplication.class, args);
	}
}