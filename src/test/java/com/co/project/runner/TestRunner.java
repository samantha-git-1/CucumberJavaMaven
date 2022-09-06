package com.co.project.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/A001_02_LoginFunctionality.feature", 
				 glue = { "com.co.project.app.StepDefinitions" }, 
				 plugin = { "pretty", "junit:Reports/XML/XmlReports.xml" },
				 monochrome = true)
public class TestRunner {

}
