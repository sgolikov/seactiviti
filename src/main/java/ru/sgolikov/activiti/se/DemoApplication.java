package ru.sgolikov.activiti.se;

import org.activiti.api.process.runtime.ProcessRuntime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private ProcessRuntime processRuntime;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
