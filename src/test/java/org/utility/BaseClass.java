package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver browserSetup(String browsername,String url) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser name");
		}
		
		driver.get(url);
		
		return driver;
	}
	
	
	public static String excelRead(String path,String sheetName,int rownum , int cellnum) throws IOException {

		//file 
		File f = new File(System.getProperty("user.dir")+ path);
		
		//convert to object 
		FileInputStream fi = new FileInputStream(f);
		
		
		//get workbook 
		
		Workbook wb = new XSSFWorkbook(fi);
		
		
		//get sheet 
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rownum); 
		
		//get cell 
		Cell cell = row.getCell(cellnum);
	
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell);
		
		//close wb 
		wb.close();
		
		return data;
	}
	
	
	public static void dropdown(WebElement element ,String locmethodType , Object input) {
		
		Select s = new Select(element);
		String methodType = locmethodType.toLowerCase();
		
		if(methodType.contains("index")) {
			s.selectByIndex((int) input);
		}
		else if(methodType.contains("value")) {
			s.selectByValue((String) input);
		}
		else if(methodType.contains("text")) {
			s.selectByVisibleText((String) input);
		}	
			
	}

	

}
