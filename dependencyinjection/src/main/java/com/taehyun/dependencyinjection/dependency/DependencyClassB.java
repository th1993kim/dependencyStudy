package com.taehyun.dependencyinjection.dependency;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class DependencyClassB implements Dependency {
    private String testString = "classB";
}
