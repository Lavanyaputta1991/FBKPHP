package RegressionSuite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Allpages.FBlogin;
import BaseNP.BrowserException;

public class TC01_login extends FBlogin
{

	public static void main(String[] args) throws BrowserException, IOException 
	
	{
	//Init_browser();
	//	Application_url(url);
	//	Enteremailid("Lavanya@gmail.com");
	//	Enterpassword("L12345");
	//	Login();
		
		
		String emailid="";
		String password="";
		String path="D:\\SELENIUM\\testdata.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("testdata");
		// Identify how many no.of rows are there in the sheet

		int rows = sheet.getLastRowNum();
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			emailid=	row.getCell(0).getStringCellValue();
			password=	row.getCell(1).getStringCellValue();	
			Init_browser();
			Application_url(url);
			EnterEmailid(emailid);
			EnterPassword(password);
			Login();
			String actual="Is this your account?";  //driver.findelement(BY.xpath("//").getTitle();
			String expected = "Is this your account?";
			int cellCount=	sheet.getRow(i).getLastCellNum();
			XSSFCell cell = row.createCell(cellCount);
			if(actual.equals(expected))
					{
				cell.setCellValue("pass");
					}
			else
			{
				cell.setCellValue("fail");
			}
			browser_close();
		}
		fs.close();

		FileOutputStream fout = new FileOutputStream(path);

		workbook.write(fout);

		fout.close();
	}
}