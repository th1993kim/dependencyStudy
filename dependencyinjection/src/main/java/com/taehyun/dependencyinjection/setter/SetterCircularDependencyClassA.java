package com.taehyun.dependencyinjection.setter;

import com.taehyun.dependencyinjection.constructor.ConstructorInjectionController;
import com.taehyun.dependencyinjection.field.FieldInjectionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterCircularDependencyClassA {
    private SetterCircularDependencyClassB setterCircularDependencyClassB;

    @Autowired
    public void setSetterCircularDependencyClassB(SetterCircularDependencyClassB setterCircularDependencyClassB){
        this.setterCircularDependencyClassB = setterCircularDependencyClassB;
    }
}
