package org.test;

import java.io.IOException;
import java.time.Duration;

import org.pom.LoginPagePom;
import org.pom.PimPage;
import org.utility.BaseClass;

public class OrangeHrmTest extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		
		//setup 
		OrangeHrmTest.browserSetup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPagePom login = new LoginPagePom(driver);
		
		
		String username = Login.excelRead("\\excelSheets\\book1.xlsx", "login", 1, 0);
		String password = Login.excelRead("\\excelSheets\\book1.xlsx", "login", 1, 1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//approach 1 
//		login.getUsername().sendKeys(username);
//		login.getPassword().sendKeys(password);
//		login.getLogin().click();
		
		
		//approach2 
//		login.setUsername(username);
//		login.setPassword(password);
//		login.clickLogin();
		
		//approach3
		
		login.orangeHrmLogin(username, password);
		
		//pim 
//		PimPage pim = new PimPage();
		
		
	}
	

}
