package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)


@CucumberOptions(features ={"src/test/resources/Features/"}, 
glue = {"api.StepDefinition"}, 

monochrome = true, 
plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
		"html:target/Cucumber",
		"junit:target/JUNITReports/reports.xml"})

public class TestRunner {

}
