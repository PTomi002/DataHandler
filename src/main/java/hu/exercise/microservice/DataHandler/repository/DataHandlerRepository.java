package hu.exercise.microservice.DataHandler.repository;

import hu.exercise.microservice.DataHandler.model.ModelData;
import org.springframework.data.repository.CrudRepository;

public interface DataHandlerRepository extends CrudRepository<ModelData, String> {

}
