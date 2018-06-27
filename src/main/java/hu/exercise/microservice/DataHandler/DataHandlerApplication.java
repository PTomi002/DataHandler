package hu.exercise.microservice.DataHandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@EnableRedisRepositories
@SpringBootApplication
public class DataHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataHandlerApplication.class, args);
    }
}
