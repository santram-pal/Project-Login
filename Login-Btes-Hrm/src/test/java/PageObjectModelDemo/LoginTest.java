package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch chrome browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver =new ChromeDriver();
				
				//create object of  login page 
				LoginPage Loginpg = new LoginPage(driver);
				//open url
				driver.get("https://www.saucedemo.com");
				Loginpg.enterUsername("standard_user");
				Loginpg.enterpassword("secret_sauce");
				Loginpg.clickLoginbutton();

	}

}
