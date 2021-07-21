package com.jenkinlearning.githubintegration;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
 public static Logger logger=LoggerFactory.getLogger(DemoApplication.class);
 
 public void printMyDemoLogs() {
	 	logger.info("inside my printMyDemoLogs");
 }

	public static void main(String[] args) {
		logger.info("------------> Running spring application");
		SpringApplication.run(DemoApplication.class, args);
	}

}
