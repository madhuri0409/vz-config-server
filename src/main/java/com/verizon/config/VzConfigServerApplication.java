package com.verizon.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
/*@EnableConfigServer to standup a config server that can communicate with other applications. */
public class VzConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VzConfigServerApplication.class, args);
	}

}
