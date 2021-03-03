package com.sgq.wowo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author 沈观清
 * 2021年3月3日
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStartApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerStartApplication.class, args);
	}
}
