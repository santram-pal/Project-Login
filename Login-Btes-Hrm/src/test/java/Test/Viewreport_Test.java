package Test;

import java.io.IOException; 

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import Page.ViewReport_page;
import TestBase.TestBase;

public class Viewreport_Test extends TestBase  {
	ViewReport_page VR;


	public Viewreport_Test() {
		super();		
	}

	@BeforeSuite


	public void setup() throws IOException {
		// TODO Auto-generated method stub
		initialize();
		VR = new ViewReport_page(driver);
	}

	@Test(priority=1)
	public void login_TestCase_without_entering_credentials() {

		VR.Click_login_button();
		driver.switchTo().alert().accept();

	}
	@Test(priority=2)
	public void login_TestCase_validUsername_validPassword() {
		
	     VR.Enterdata_usersametextbox(prop.getProperty("user1"));
		VR.Enterdata_passwordtextbox(prop.getProperty("pass1"));		
		VR.Click_login_button();
		//Popup handling
	}
	@Test(priority=3)
	public void  Perform_Reports() 
	{
		VR.Move_to_reports_dropdwon();
		VR.Click_View_Report();
	}
	@Test(priority=4)
	public void Switch_to_iframe_Access_Select_drop_Id() {
		VR.Switch_TO_iframe();
	    VR.Access_Select_Drop_Id();
	}
	@Test(priority=5)
	public void EnterId_Search_for_textBox() {
		VR.Enter_Id_Search_TextBox(prop.getProperty("Searchfor"));
	}
	@Test(priority=6)
	public void Click_Search_Button_Access_Id() {
		VR.Click_Search_Button();
	}
	@Test(priority=7)
	public void Click_Reset_Button_Clear_Id() {
		VR.Click_Reset_Button();
	}
	@Test(priority=8)
	public void Click_Link_Text_newrpoet() {
		VR.Click_REP012_Link_text();
	}
	@Test(priority=9)
	public void Click_Back_Button_Reverse_View_ReportEmployee() {
		VR.Click_Back_Button();
	}

	
//	@AfterSuite
//	public void teardown()
//     {
//		closure();
//	}


}
