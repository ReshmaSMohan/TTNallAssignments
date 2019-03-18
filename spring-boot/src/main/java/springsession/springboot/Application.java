package springsession.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springsession.springboot.entity.User;

@SpringBootApplication
@EntityScan(basePackages = {"springsession.springboot.entity"})
@EnableJpaRepositories(basePackages = {"springsession.springboot.repository"})
public class Application {

	@Bean
	public User user(){
		User user = new User("reshma","pwd");
		return user;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
