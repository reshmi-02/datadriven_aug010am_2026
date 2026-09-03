package org.test;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPagePom;

public class JunitTest {
	WebDriver driver;
	LoginPagePom login ;
//	@BeforeClass
//	public static void beforeclass() {
//		// TODO Auto-generated method stub
//		System.out.println("beforeclass");
//	}
//	
//	@AfterClass
//	public static void afterClass() {
//		// TODO Auto-generated method stub
//		System.out.println("After class");
//	}
	
	
	@Before
	public void before() {
		// TODO Auto-generated method stub
		System.out.println("Before");
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 login = new LoginPagePom(driver);
	}
	
	@After
	public void after() {
		// TODO Auto-generated method stub
		System.out.println("After");
		driver.quit();
	}
	
	

	@Test
	public void validlogin() {
		// TODO Auto-generated method stub
		System.out.println("test02");
		
		login.orangeHrmLogin("Admin", "admin123");
		
		
	}
	
	
	@Test
	public void invalidlogin() {
		// TODO Auto-generated method stub
		System.out.println("test 01");
		login.orangeHrmLogin("priya", "priya123");
	}
	
}
