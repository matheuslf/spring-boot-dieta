package spring.boot.dieta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableJpaRepositories("spring.boot.dieta.repository")
public class DietaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietaApplication.class, args);
	}

}
