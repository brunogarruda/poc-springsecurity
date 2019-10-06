package br.com.springsecurity.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"br.com.springsecurity.poc.repository"})
@EntityScan(basePackages = {"br.com.springsecurity.poc.domain"})
public class PocSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringSecurityApplication.class, args);
	}

}
