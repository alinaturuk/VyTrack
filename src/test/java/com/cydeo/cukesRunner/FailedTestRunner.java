package com.cydeo.cukesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/rerunLocation.txt",//use @ to locate proper target folder
        glue="com/cydeo/step_definitions"
)
public class FailedTestRunner {
}
