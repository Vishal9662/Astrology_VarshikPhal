package com.astrology.lalkitab;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LalkitabChartService {
    private final LalkitabChartRepository repository;

    public LalkitabChartService(LalkitabChartRepository repository) {
        this.repository = repository;
    }

    public List<LalkitabChart> getAllCharts() {
        return repository.findAll();
    }

    public Optional<LalkitabChart> getChartById(Long id) {
        return repository.findById(id);
    }

}
