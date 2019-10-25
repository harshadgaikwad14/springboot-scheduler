package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootSchedulerApplication {

	// Online create cron job expression http://www.cronmaker.com
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSchedulerApplication.class, args);
	}

}
