package com.Orange.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Orange.qa.Base.TestBase;

public class OrangeHRM_Homepage extends TestBase{

	@FindBy(xpath = "//span[contains(text(),'Reports ')]")WebElement reports;
	
	public OrangeHRM_Homepage() throws IOException {
		super();
		
	}
	
 
}
