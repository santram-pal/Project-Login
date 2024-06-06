package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class ViewReport_page extends TestBase{
	//POM using Page Factory Implementation
		//@FindBy(locator= "locatorvalue")
		// WebElement element;
		WebDriver driver;
		public ViewReport_page(WebDriver d) {
			driver= d;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//*[@name='txtUserName']")
		WebElement username_txtbox;
		
		@FindBy(xpath="//*[@name='txtPassword']")
		WebElement password_txtbox;
		
		@FindBy(xpath="//input[@name=\"Submit\"]")
		WebElement login_button;
		
		@FindBy(linkText="Reports")
		WebElement Reportdrop;
		
		@FindBy(linkText="View Reports")
		WebElement  View_Report_link;
		
		@FindBy(xpath ="//iframe[@id='rightMenu']")
		WebElement iframe;

		@FindBy(xpath ="//select[@name='loc_code']")
		WebElement Select_drop;

		@FindBy(xpath ="//input[@name='loc_name']")
		WebElement Search_text_box;

		@FindBy(css="input[value=Search]")
		WebElement Search_button;

		@FindBy(css="input[value=Reset]")
		WebElement Reset_Button;
		
		@FindBy(linkText="REP012")
		WebElement link_newreport;
		
		@FindBy(xpath="//input[@type='button']")
		WebElement Back_Button;

		
		public void Enterdata_usersametextbox(String uname)
		{
			username_txtbox.sendKeys(uname);
		}
		
		public void Enterdata_passwordtextbox(String password)
		{
			password_txtbox.sendKeys(password);
		}
		
		public boolean Check_username_textbox()
		{
			return username_txtbox.isDisplayed();
			//password_txtbox.isDisplayed();
		}
		
		public void Click_login_button()
		{
			login_button.submit();
		}
		public void Move_to_reports_dropdwon() 
		{
		Actions ac=new Actions (driver);
		ac.moveToElement( Reportdrop).build().perform();
		
		}
		public void Click_View_Report() 
		{
			View_Report_link.click();
		}
		
		public void Switch_TO_iframe() {
			driver.switchTo().frame(iframe);
		}
		public void Access_Select_Drop_Id() {
			 Select s
			 = new Select(Select_drop);
			s.selectByVisibleText("ID");
		}
		public void Enter_Id_Search_TextBox(String Id) {
			Search_text_box.sendKeys(Id);
		}
		public void Click_Search_Button() {
			Search_button.click();
		}
		public void Click_Reset_Button() {
			Reset_Button.click();
		}
		public void Click_REP012_Link_text() {
			link_newreport.click();
		}
		public void Click_Back_Button() {
			Back_Button.click();
		}

		public void login(String uname, String password)
		{
			username_txtbox.sendKeys(uname);
			password_txtbox.sendKeys(password);
			login_button.submit();
		}		
}
