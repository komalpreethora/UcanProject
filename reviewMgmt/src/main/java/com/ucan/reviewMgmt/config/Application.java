package com.ucan.reviewMgmt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ucan.sharedLib.PortConstants;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {

		System.getProperties().put( "server.port", PortConstants.REVIEWMGMT);
		SpringApplication.run(Application.class, args);
	}
}