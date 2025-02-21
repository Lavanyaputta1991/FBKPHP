package RunnerFB;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"FBfeature"},
                 glue =     {"FBStepdefinition"},
                 plugin =    { "pretty",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                  monochrome = true )
public class FbRunner extends AbstractTestNGCucumberTests
{
	
	}