package com.stc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wigglesworth.m
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMsApplication.class, args);
	}

}
