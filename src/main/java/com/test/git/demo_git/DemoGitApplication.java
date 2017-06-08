package com.test.git.demo_git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitApplication.class, args);
		System.out.println("Test from cfloresm fork");
		System.out.println("cambio de luis");
	}
}
