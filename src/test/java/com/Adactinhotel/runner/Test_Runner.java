package com.Adactinhotel.runner;

import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.Helper.File_Reader_Manager;
import com.baseclass.Baseclass;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactinhotel//feature",
glue="com.Adactinhotel.stepdefinition",
monochrome = true,
dryRun= false,
strict = false,
tags =("@SanityTest,@regressionTest"),
plugin= 
{"html:Report/HTML_Report",
		"pretty",
		"json:Report/CucumberJSON_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
}
)



public class Test_Runner {
	
	public static WebDriver driver; 
	
	@BeforeClass
	public static void Set_Up() throws Throwable {
		
	String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();

     driver = Baseclass.browserLaunch(browser);
		
		
	}
	@AfterClass
	public static void Tear_Down() {
		driver.close();

	}

}

