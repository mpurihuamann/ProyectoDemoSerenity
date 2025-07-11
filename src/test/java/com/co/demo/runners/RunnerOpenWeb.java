package com.co.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/openweb.feature",
        glue = "com.co.demo.stepdefinitions",
        tags = "@mercy"
)
public class RunnerOpenWeb {
}