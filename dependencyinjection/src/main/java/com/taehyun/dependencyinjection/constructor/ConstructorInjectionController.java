package com.taehyun.dependencyinjection.constructor;

import com.taehyun.dependencyinjection.dependency.Dependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {

    private final Dependency dependency;

    public ConstructorInjectionController(@Qualifier(value = "DependencyClassA") Dependency dependency) {
        this.dependency = dependency;
    }

    @GetMapping("/constructorInjection")
    public ResponseEntity<String> constructorInjection(){
        return ResponseEntity.status(HttpStatus.OK).body(dependency.getTestString());
    }


}
