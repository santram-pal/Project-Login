package Test;


import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.DefineReport_Page;
import TestBase.TestBase;

public class DefineReport_Test extends TestBase {
	 private static final String Rname = null;
	DefineReport_Page DR;


	public  DefineReport_Test() {
		super();		
	}

	@BeforeSuite


	public void setup() throws IOException {
		// TODO Auto-generated method stub
		initialize();
		DR = new DefineReport_Page(driver);
	}

	@Test(priority=1)
	public void login_TestCase_without_entering_credentials() {

		DR.Click_login_button();
		driver.switchTo().alert().accept();

	}
	@Test(priority=2)
	public void login_TestCase_validUsername_validPassword() {
		
	     DR.Enterdata_usersametextbox(prop.getProperty("user1"));
		DR.Enterdata_passwordtextbox(prop.getProperty("pass1"));		
		DR.Click_login_button();
		//Popup handling
	}
	@Test(priority=3)
	public void  Perform_Reports() 
	{
		DR.Move_to_reports_dropdwon();
		DR.Click_Define_Report();
	}
	@Test(priority=4)
	public void Switch_to_iframe_Access_Select_drop_Id() {
		DR.Switch_TO_iframe();
	    DR.Access_Select_Drop_Id();
	}
	@Test(priority=5)
	public void EnterId_Search_for_textBox() {
		DR.Enter_Id_Search_TextBox(prop.getProperty("Searchfor"));
	}
	@Test(priority=6)
	public void Click_Search_Button_Access_Id() {
		DR.Click_Search_Button();
	}
	@Test(priority=7)
	public void Click_Reset_Button_Clear_Id() {
		DR.Click_Reset_Button();
	}
	@Test(priority=8)
		public void click_Add_Button() {
			DR.Click_Add_Button();		
	}
	
	@Test(priority=9)
	public void  Enterdata_Report_name_textBox(){
		DR.Enterdata_Report_name_textBox(prop.getProperty("Name"));
	}
	
//	@Test(priority=20)
//	public void Click_Link_Text_newreport() {
//		DR.Click_REP012_Link_text();
//	}
//	@Test(priority=21)
//	public void Click_Back_Button_Reverse_Define_Report_Employee() {
//		DR.Click_Back_Button();
//	}

	
//	@AfterSuite
//	public void teardown()
//	{
//		closure();
//	}
}

