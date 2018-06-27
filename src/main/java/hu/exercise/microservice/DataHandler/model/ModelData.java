package hu.exercise.microservice.DataHandler.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("data")
public class ModelData {

    private String id;
}
