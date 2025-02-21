package GenericMethods;



import java.io.*;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;



import BaseNP.BaseNP;

public class GenericMethod extends BaseNP
{

	public static void Click(WebElement element)
	{
		//element.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
		public static String Takescreenshot() throws IOException
		{

		TakesScreenshot tc=(TakesScreenshot)driver;
		
		File srcfile=tc.getScreenshotAs(OutputType.FILE);
		
		File destfile=new File("D://SELENIUM//"+"ScreenCapture"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(srcfile, destfile);
		
	String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
		
		}

}
