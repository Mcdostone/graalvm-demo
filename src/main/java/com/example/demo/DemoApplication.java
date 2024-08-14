package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String... args)  {
		var found = false;
		for(var entry: System.getProperties().entrySet()) {
			if(entry.getKey().equals("foo")) {
				found = true;
			}
		}
		if(found) {
			logger.info("'foo' property has been found");
		} else {
			logger.error("'foo' property has not been found");
		}
	}
}
