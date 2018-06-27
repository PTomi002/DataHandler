package hu.exercise.microservice.DataHandler.controller;

import hu.exercise.microservice.DataHandler.model.ModelData;
import hu.exercise.microservice.DataHandler.repository.DataHandlerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DataHandlerController {

    private final DataHandlerRepository dataHandlerRepository;

    @GetMapping("/{id}")
    public String getData(@PathVariable final String id) {
        log.info("Get data with id: {}", id);
        return dataHandlerRepository.findById(id).map(ModelData::getId).orElse(StringUtils.EMPTY);
    }

    @PostMapping("/{id}")
    void save(@PathVariable final String id) {
        log.info("Save data with id: {}", id);
        dataHandlerRepository.save(modelData(id));
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable final String id) {
        log.info("Delete data with id: {}", id);
        dataHandlerRepository.deleteById(id);
    }

    private ModelData modelData(final String id) {
        final ModelData modelData = new ModelData();
        modelData.setId(id);
        return modelData;
    }
}
