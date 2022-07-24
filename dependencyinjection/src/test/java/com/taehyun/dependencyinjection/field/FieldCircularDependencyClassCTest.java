package com.taehyun.dependencyinjection.field;

import com.taehyun.dependencyinjection.dependency.DependencyClassA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

class FieldCircularDependencyClassCTest {

    private FieldInjectionController fieldInjectionController;

    @BeforeEach
    void setUp() throws NoSuchFieldException, IllegalAccessException {
        fieldInjectionController = new FieldInjectionController();
        Field field = fieldInjectionController.getClass().getDeclaredField("dependency");
        field.setAccessible(true);
        field.set(fieldInjectionController,new DependencyClassA());
    }

    @Test
    void getString(){
        ResponseEntity<String> responseEntity = fieldInjectionController.fieldInjection();
        String body = responseEntity.getBody();

        assertThat(body).isEqualTo("classA");
    }

}