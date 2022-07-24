package com.taehyun.dependencyinjection.field;

import org.junit.jupiter.api.BeforeEach;

class FieldCircularDependencyClassCTest {

    private FieldInjectionController fieldInjectionController;

    @BeforeEach
    void setUp(){
        fieldInjectionController = new FieldInjectionController();

    }

}