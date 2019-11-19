package com.springboot.k8s.DockerK8S;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java",
        glue="com/springboot/k8s/DockerK8S",
        format = {"json:target/cucumber.json"})
public class TestRunner {
}
