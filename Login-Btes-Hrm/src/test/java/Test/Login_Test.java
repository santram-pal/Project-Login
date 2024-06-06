package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.Login_Page;
import TestBase.TestBase;

public class Login_Test extends TestBase{
	Login_Page LP;
	

	public Login_Test() {
		super();		
	}
	
	@BeforeSuite
	
	
	public void setup() throws IOException {
		// TODO Auto-generated method stub
		initialize();
		LP= new Login_Page(driver);
	}

	@Test(priority=1)
	public void login_TestCase_without_entering_credentials() {

		LP.Click_login_button();
		driver.switchTo().alert().accept();
		

	}
	
	@Test(priority=2)
	public void login_TestCase_invalidUsername_invalidPassword() {
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));		
		LP.Click_login_button();
		//Popup handling
	
	}
	@Test(priority=3)
	public void login_TestCase_invalidUsername_validPassword() {
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));		
		LP.Click_login_button();
		//Popup handling
	}
	@Test(priority=4)
	public void login_TestCase_validUsername_invalidPassword() {
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));		
		LP.Click_login_button();
		//Popup handling
	}
	@Test(priority=5)
	public void login_TestCase_validUsername_validPassword() {
		LP.Cleardata_usersametextbox();
		LP.Enterdata_usersametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));		
		LP.Click_login_button();
		//Popup handling
	}
	
	@AfterSuite
	public void teardown()
	{
		closure();
	}


}
