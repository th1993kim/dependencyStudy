package com.taehyun.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterCircularDependencyClassC {

    private SetterCircularDependencyClassA setterCircularDependencyClassA;

    @Autowired
    public void setSetterCircularDependencyClassA(SetterCircularDependencyClassA setterCircularDependencyClassA) {
        this.setterCircularDependencyClassA = setterCircularDependencyClassA;
    }
}
