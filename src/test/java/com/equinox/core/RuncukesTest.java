package com.equinox.core;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//tags= "@smokeTest",
@CucumberOptions(features = "src/test/resources/web.feature",format = "json:target/cucumber-report.json")
public class RuncukesTest extends AbstractTestNGCucumberTests {


	
}
