package PageObjectModelDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutPom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https://www.saucedemo.com");
		//find & enter username 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//find & enter the password 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//find & enter the login button 
		driver.findElement(By.id("login-button")).click();

	}

}
