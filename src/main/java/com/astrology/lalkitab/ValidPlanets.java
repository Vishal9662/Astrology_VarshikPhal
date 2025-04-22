package com.astrology.lalkitab;

import jakarta.validation.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PlanetsValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPlanets {
    String message() default "Invalid planet";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}


