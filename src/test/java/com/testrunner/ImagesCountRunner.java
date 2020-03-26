package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\TestCases.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC08_Yourlogo"},
		glue = {"com.Stepdefinition"},
		monochrome = true
		)
public class ImagesCountRunner {

}