package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		//file 
		File f = new File(System.getProperty("user.dir")+ "\\excelSheets\\book1.xlsx");
		
		//convert to object 
		FileInputStream fi = new FileInputStream(f);
		
		
		//get workbook 
		
		Workbook wb = new XSSFWorkbook(fi);
		
		
		//get sheet 
		Sheet sheet = wb.getSheet("login");
		
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		for(int i=1 ; i<rowcount ;i++) { //4<4
			
			Row row = sheet.getRow(i); //3
			
			for(int j=0;j<cellcount;j++) {  //0<2 
				
				Cell cell = row.getCell(j); //1 
				DataFormatter format = new DataFormatter();
				String data = format.formatCellValue(cell);
				System.out.println(data);
//				username.sendKeys(data); //kavi 47891
//				password.sendKeys(data); //kavi 47891
			}
			
		}
		
		
		//get row 
//		Row row = sheet.getRow(1); 
//		
//		//get cell 
//		Cell cell1 = row.getCell(1);
//		Cell cell2 = row.getCell(0);
//		
////		String data = cell.getStringCellValue();
//		DataFormatter format = new DataFormatter();
//		String data1 = format.formatCellValue(cell1);
//		String data2 = format.formatCellValue(cell2);
//		System.out.println(data1);
//		System.out.println(data2);
//		
//		//close wb 
//		wb.close();
//		
//		
//		//automation code 
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		
//		WebElement search = driver.findElement(By.xpath("//textarea[@title='Search']"));
//		search.sendKeys(data1);
		
	}

}
