package org.learn.cucumber.chapter2;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features/chapter2")
@ConfigurationParameter(key = "cucumber.glue", value = "org.learn.cucumber.chapter2")
class CucumberTest {

}
