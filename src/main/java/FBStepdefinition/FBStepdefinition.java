package FBStepdefinition;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.FBlogin;
import BaseNP.BrowserException;
import GenericMethods.GenericMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FBStepdefinition extends FBlogin
{
@Given("user is on login page")
	public static void user_is_on_login_page() throws BrowserException, IOException
	{
	Init_browser();
	Application_url(url);
	ExtentCucumberAdapter.addTestStepLog(" user is on login page");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
	}



@When("^user enters valid username \"([^\"]*)\"$")
public void user_enters_valid_username(String Emailid) throws IOException 
{
	EnterEmailid(Emailid);
	// take screenshot --we need call
	ExtentCucumberAdapter.addTestStepLog("user entered the username"+Emailid);
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
}

@When("^user enters valid password \"([^\"]*)\"$")
public void user_enters_valid_password(String password)
{
   
	EnterPassword(password);
	ExtentCucumberAdapter.addTestStepLog("user entered the password"+password);
}



@And("user clicks on submit")
public static void user_clicks_on_submit() throws IOException
{
	Login();
	ExtentCucumberAdapter.addTestStepLog("you have clicked the login button");
	ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethod.Takescreenshot());
}

@Then("user should be on home page")
public static void user_should_be_on_home_page()
{
	// if("Welcome to FB".equals(driver.gettitle())
	{
		//SOP("pass");
	}
}

}