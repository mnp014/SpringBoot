package xyz.prazy.springbootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                //tells this is a spring boot application and this is the starting point of application.
public class HelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);   // creates a servlet container and host this application in this servlet container 
	}
}
