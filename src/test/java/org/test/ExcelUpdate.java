package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) throws IOException {
		

		//file 
		File f = new File(System.getProperty("user.dir")+ "\\excelSheets\\book1.xlsx");
		
		//convert to object 
		FileInputStream fi = new FileInputStream(f);
		
		
		//get workbook 
		Workbook wb = new XSSFWorkbook(fi);
		
		
		Sheet sheet = wb.getSheet("demo");
		
		Row row = sheet.getRow(3);
		
		Cell cell = row.getCell(3);
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell);
		
		if(data.equalsIgnoreCase("world")) {
			cell.setCellValue("country");
		}
		
		FileOutputStream fo = new FileOutputStream(f);

		wb.write(fo);

		wb.close();
	}

}
