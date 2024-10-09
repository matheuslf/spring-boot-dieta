package spring.boot.dieta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DietaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietaApplication.class, args);
	}

}
