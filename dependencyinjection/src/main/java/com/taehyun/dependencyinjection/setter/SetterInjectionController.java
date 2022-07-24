package com.taehyun.dependencyinjection.setter;

import com.taehyun.dependencyinjection.dependency.Dependency;
import com.taehyun.dependencyinjection.dependency.DependencyClassA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterInjectionController {
    private Dependency dependency;

    @Autowired
    public void setDependency(@Qualifier(value = "DependencyClassA") Dependency dependency){
        this.dependency = dependency;
    }


    @GetMapping("/setterInjection")
    public ResponseEntity<String> setterInjection(){
        return ResponseEntity.status(HttpStatus.OK).body(dependency.getTestString());
    }
}
