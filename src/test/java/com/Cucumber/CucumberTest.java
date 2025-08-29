package com.Cucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
 
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")   // folder under src/test/resources/features
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty",
                       key = GLUE_PROPERTY_NAME,  value = "com.example.steps")
@CucumberContextConfiguration
@SpringBootTest()
public class CucumberTest {
}

// if we did not specify the glue property name it will search for step defination inside cucumber tets package or sub package
