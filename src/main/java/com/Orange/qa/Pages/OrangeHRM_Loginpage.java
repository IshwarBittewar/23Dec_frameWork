package com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.qa.Base.TestBase;

public class OrangeHRM_Loginpage extends TestBase {

	@FindBy(xpath ="//input[@name=\"username\"]") WebElement Username;
	@FindBy(xpath ="//input[@name=\"password\"]") WebElement Password;
	@FindBy(xpath = "//button[@type=\"submit\"]") WebElement Loginbutton;
  @FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")WebElement HomepageUsername;
	 
	public OrangeHRM_Loginpage () throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	
	public  boolean validateusername (String UN,String PWD ) throws InterruptedException {
		
		Username.sendKeys(UN);
		Thread.sleep(3000);
		Password.sendKeys(PWD);
		Thread.sleep(3000);
		Loginbutton.click();
		
		return HomepageUsername.isDisplayed();
				
	}
	public String validatepagetitle (String UN, String PWD) throws InterruptedException {
		Username.sendKeys(UN);
		Thread.sleep(3000);
		Password.sendKeys(PWD);
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
}
