package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;


@SpringBootApplication
@EnableEncryptableProperties
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
