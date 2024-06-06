package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//without  page factory
public class LoginPage {
	WebDriver driver;
	//constructor 
	LoginPage(WebDriver d)
	{
		driver =d;
	}
	//locate webElement
	By username=By.id("user-name");
	
	By password=By.id("password");
	
	By loginbutton=By.id("login-button");
	
	public void  enterUsername(String uname) 
	{
	driver.findElement(username).sendKeys(uname);
		
	}
	public void enterpassword(String pass) 
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginbutton() 
	{
		driver.findElement(loginbutton).click();
	
	}

}

