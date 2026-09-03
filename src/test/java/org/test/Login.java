package org.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utility.BaseClass;

public class Login extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = Login.browserSetup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String username = Login.excelRead("\\excelSheets\\book1.xlsx", "login", 1, 0);
		String password = Login.excelRead("\\excelSheets\\book1.xlsx", "login", 1, 1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
