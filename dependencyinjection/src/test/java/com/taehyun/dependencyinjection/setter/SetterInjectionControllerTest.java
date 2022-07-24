package com.taehyun.dependencyinjection.setter;

import com.taehyun.dependencyinjection.dependency.DependencyClassA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @BeforeEach
    void setSetterInjectionController(){
        setterInjectionController = new SetterInjectionController();
        setterInjectionController.setDependency(new DependencyClassA());
    }

    @Test
    void getString(){
        ResponseEntity<String> responseEntity = setterInjectionController.setterInjection();
        String body = responseEntity.getBody();

        assertThat(body).isEqualTo("test");
    }



}