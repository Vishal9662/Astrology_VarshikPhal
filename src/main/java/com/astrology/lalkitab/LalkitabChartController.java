package com.astrology.lalkitab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/lalkitab")
@CrossOrigin(origins = "*")
public class LalkitabChartController {

    @Autowired
    private LalkitabChartService lalkitabChartService;

    @GetMapping("/")
    public List<LalkitabChart> getAllCharts() {
        return lalkitabChartService.getAllCharts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LalkitabChart> getChartById(@PathVariable("id") Long id) {
        Optional<LalkitabChart> chart = lalkitabChartService.getChartById(id);
        return chart.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
