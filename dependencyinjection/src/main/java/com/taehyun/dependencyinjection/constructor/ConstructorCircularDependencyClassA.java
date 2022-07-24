package com.taehyun.dependencyinjection.constructor;

import com.taehyun.dependencyinjection.field.FieldInjectionController;
import com.taehyun.dependencyinjection.setter.SetterInjectionController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ConstructorCircularDependencyClassA {

    private final ConstructorCircularDependencyClassB constructorCircularDependencyClassB;

}
