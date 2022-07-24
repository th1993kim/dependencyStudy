package com.taehyun.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterCircularDependencyClassB {
    private SetterCircularDependencyClassC setterCircularDependencyClassC;

    @Autowired
    public void setSetterCircularDependencyClassC(SetterCircularDependencyClassC setterCircularDependencyClassC){
        this.setterCircularDependencyClassC = setterCircularDependencyClassC;
    }
}
