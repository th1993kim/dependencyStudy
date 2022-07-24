package com.taehyun.dependencyinjection.constructor;

import com.taehyun.dependencyinjection.dependency.DependencyClassA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

class ConstructorInjectionControllerTest {

    private ConstructorInjectionController constructorInjectionController;

    @BeforeEach
    void setUp(){
        constructorInjectionController = new ConstructorInjectionController(new DependencyClassA());
    }

    @Test
    void getTestString(){
        ResponseEntity<String> responseEntity = constructorInjectionController.constructorInjection();
        String body = responseEntity.getBody();

        assertThat(body).isEqualTo("test");
    }


}