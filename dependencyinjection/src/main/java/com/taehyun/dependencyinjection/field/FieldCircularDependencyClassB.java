package com.taehyun.dependencyinjection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldCircularDependencyClassB {
    @Autowired
    private FieldCircularDependencyClassC fieldCircularDependencyClassC;

}
