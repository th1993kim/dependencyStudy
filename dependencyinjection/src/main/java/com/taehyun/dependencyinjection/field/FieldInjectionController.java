package com.taehyun.dependencyinjection.field;

import com.taehyun.dependencyinjection.dependency.Dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionController {

    @Qualifier(value = "DependencyClassA")
    @Autowired
    private Dependency dependency;


    @GetMapping("/fieldInjection")
    public ResponseEntity<String> fieldInjection(){
        return ResponseEntity.status(HttpStatus.OK).body(dependency.getTestString());
    }

}
