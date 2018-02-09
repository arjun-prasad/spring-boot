package arj.spring.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(SpringBootSimpleApplication.class, args);
	}
}
