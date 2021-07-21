package com.jenkinlearning.githubintegration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoApplicationTests {
	 public static Logger logger=LoggerFactory.getLogger(DemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Running my test class...");
		assertEquals(true, true);
	}
	

}
