package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseNP.BaseNP;
import GenericMethods.GenericMethod;

public class FBlogin extends BaseNP
{
private static By FBEmailid=By.id("email");
public static By FBpasswordid=By.id("pass");
public static By login=By.name("login");

public static WebElement GetFBEmailid()
{
	
	return driver.findElement(FBEmailid);
}

public static void EnterEmailid(String Email)
{
	GetFBEmailid().sendKeys(Email);
}
public static void EnterPassword(String password)
{
	driver.findElement(FBpasswordid).sendKeys(password);
}

public static void Login()
{
	GenericMethod GM= new GenericMethod();
	WebElement element=driver.findElement(login);
	GM.Click(element);
}
}
