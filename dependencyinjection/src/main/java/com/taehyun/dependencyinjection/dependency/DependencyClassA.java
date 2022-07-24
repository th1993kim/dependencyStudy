package com.taehyun.dependencyinjection.dependency;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier(value = "DependencyClassA")
@Getter
@Component
public class DependencyClassA implements Dependency {
    private String testString = "classA";
}
