package lviv.iot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"lviv.iot.controller", "lviv.iot.service", "lviv.iot.exceptions", "lviv.iot.config", "lviv.iot.repository"})
@EntityScan({"lviv.iot.models"})
@EnableJpaRepositories({"lviv.iot.repository"})
public class Application {
      public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


