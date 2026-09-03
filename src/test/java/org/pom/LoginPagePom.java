package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPagePom {
	
	//constructor 
	WebDriver driver ; 
	
	public LoginPagePom(WebDriver driver ) {
		this.driver=driver;
	}
	
	//locators
	
	private By username = By.name("username"); 
	
	private By password = By.name("password");
	
	private By login = By.xpath("//button[@type='submit']");
	
	
	//methods and actions 
	
	  public WebElement getUsername() {
		  return driver.findElement(username);
	  }
	  
	  public void setUsername(String username) {
		driver.findElement(this.username).sendKeys(username);
	  }
	  

	  public WebElement getPassword() {
		  return driver.findElement(this.password);
	  }
	  
	  
	  public void setPassword(String password) {
		  driver.findElement(this.password).sendKeys(password);
	  }
	  
	  
	  public WebElement getLogin() {
		  return  driver.findElement(login);
	  }
	  
	  public void clickLogin() {
		  driver.findElement(login).click();
	  }
	  
	  public void  orangeHrmLogin(String username,String password) {
		  driver.findElement(this.username).sendKeys(username);
		  driver.findElement(this.password).sendKeys(password);
		  driver.findElement(this.login).click();
	  }
	
	
	
	//constructor 
//	  public LoginPagePom() {
//		  
//		  PageFactory.initElements(driver, this);
//		  
//	  }
//	
//	
//	//locators 
//	  @FindBy(name = "username")
//	  private WebElement username;
//	  
//	  @FindBy(name = "password")
//	  private WebElement password;
//	  
//	  @FindBy(xpath = "//button[@type='submit']")
//	  private WebElement login;
//	
//	//methods and actions 
//	
//	  public WebElement getUsername() {
//		  return username;
//	  }
//	  
//	  public void setUsername(String username) {
//		  this.username.sendKeys(username);
//	  }
//	  
//
//	  public WebElement getPassword() {
//		  return password;
//	  }
//	  
//	  
//	  public void setPassword(String password) {
//		  this.password.sendKeys(password);
//	  }
//	  
//	  
//	  public WebElement getLogin() {
//		  return login;
//	  }
//	  
//	  public void clickLogin() {
//		  login.click();
//	  }
//	  
//	  public void  orangeHrmLogin(String username,String password) {
//		  this.username.sendKeys(username);
//		  this.password.sendKeys(password);
//		  this.login.click();
//	  }
	  
}
