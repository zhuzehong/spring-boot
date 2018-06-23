package com.jerry.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class JerrySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(JerrySpringBootApplication.class);
		Environment env = springApplication.run(args).getEnvironment();
		log.info("Marketing Cloud Domain server for marketing has started : {}, CPU core : {}"
				, Arrays.toString(env.getActiveProfiles()), Runtime.getRuntime().availableProcessors());
	}
}
