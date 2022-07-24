package com.taehyun.dependencyinjection.field;

import com.taehyun.dependencyinjection.constructor.ConstructorInjectionController;
import com.taehyun.dependencyinjection.setter.SetterInjectionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldCircularDependencyClassA {
    @Autowired
    private FieldCircularDependencyClassB fieldCircularDependencyClassB;
}
