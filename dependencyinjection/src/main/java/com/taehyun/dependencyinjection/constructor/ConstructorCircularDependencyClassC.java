package com.taehyun.dependencyinjection.constructor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ConstructorCircularDependencyClassC {
    //private final ConstructorCircularDependencyClassA constructorCircularDependencyClassA;
}
