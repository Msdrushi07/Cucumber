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
@IncludeTags("signup") // only run the scenario where @signup in tagged
@ConfigurationParameter(
    key = io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME,
    value = "pretty"
)
@ConfigurationParameter(
    key = io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME,
    value = "com.example.steps"
)
 // tag filter only run scenario where @somke is used
@ConfigurationParameter(
    key = io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME,
    value = "@smoke"
)
 
@CucumberContextConfiguration
@SpringBootTest()
public class CucumberTest {
}

// if we did not specify the glue property name it will search for step defination inside cucumber tets package or sub package
//SelectClasspathResource("") if feature file inside src/test/resource
