package com.astrology.lalkitab;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lalkitab_chart")
public class LalkitabChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "lalkitab_chart_planets", joinColumns = @JoinColumn(name = "lalkitab_chart_id"))
    @Column(name = "planets")
    @ValidPlanets
    private List<String> planets;

    public LalkitabChart() {
    }

    public LalkitabChart(Long id, List<String> planets) {
        this.id = id;
        this.planets = planets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public void setPlanets(List<String> planets) {
        this.planets = planets;
    }
}
