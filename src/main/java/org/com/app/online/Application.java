package org.com.app.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.com.app.online.controller")
public class Application {

	public static void main(String[] args) throws Throwable {

		SpringApplication.run(Application.class, args);
	}

}
