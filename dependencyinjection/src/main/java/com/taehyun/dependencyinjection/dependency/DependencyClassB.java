package com.taehyun.dependencyinjection.dependency;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DependencyClassB implements Dependency {
    private int testInt = 0;
    private String testString = "test";
}
