package com.amazon.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\marri\\eclipse-workspace\\AmazonCucumber\\src\\test\\java\\com\\amazon\\features\\login.feature",
		glue= {"com.amazon.stepdefinitions"},
		dryRun=true
		)
public class Runner {

}
