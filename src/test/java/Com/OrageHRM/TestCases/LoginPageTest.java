package Com.OrageHRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Orange.qa.Base.TestBase;
import com.Orange.qa.Pages.OrangeHRM_Loginpage;

public class LoginPageTest extends TestBase {

	OrangeHRM_Loginpage Loginpage;
	public LoginPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		Loginpage = new OrangeHRM_Loginpage();
		
	}
	@Test
	public void Orangeuser() throws InterruptedException {
		boolean UserId=Loginpage.validateusername(pros.getProperty("username"), pros.getProperty("Password"));
	Assert.assertTrue(false);	 
	}
	@Test
	public void Orangehrmtitle() throws InterruptedException {
		String pagetitle=Loginpage.validatepagetitle(pros.getProperty("username"), pros.getProperty("Password"));
	Assert.assertEquals(pagetitle, pros.getProperty("Title"));
	}
	@AfterMethod
	public void Teardown() {
	driver.quit(); 
	}

	
}
