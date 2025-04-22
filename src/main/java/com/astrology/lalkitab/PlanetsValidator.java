package com.astrology.lalkitab;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class PlanetsValidator implements ConstraintValidator<ValidPlanets, List<String>> {

    private static final List<String> VALID_PLANETS = List.of(
            "Me", "Ve", "Ea", "Ma", "Ju", "Sa", "Ur", "Ne", "Pl"
    );

    @Override
    public boolean isValid(List<String> value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        if (value.size() > 9) {
            return false;
        }

        for (String planet : value) {
            if (planet != null && !VALID_PLANETS.contains(planet)) {
                return false;
            }
        }

        return true;
    }
}
