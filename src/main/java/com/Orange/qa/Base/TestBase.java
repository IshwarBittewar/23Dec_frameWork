package com.Orange.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Orange.qa.util.TestUtil;

import net.bytebuddy.utility.RandomString;

public class TestBase {
 public static WebDriver  driver;
 public static Properties pros;
 
public TestBase () throws IOException {
	pros =new Properties();
	
	FileInputStream ip =new FileInputStream("C:\\Users\\ishwa\\eclipse-workspace\\23Dec_FrameWork\\src\\main\\java\\com\\Orange\\qa\\config\\config.properties");
        pros.load(ip);	
}

@SuppressWarnings("deprecation")
public static void initialization() {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishwa\\eclipse-workspace\\23Dec_FrameWork\\Browsers\\chromedriver.exe");
	 
	 driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	 
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMOUT, TimeUnit.SECONDS);
	 
	 driver.get(pros.getProperty("url"));
	 
}
public String getScreenshotAs(String testCaseName) throws IOException {
	
	TakesScreenshot ts = (TakesScreenshot)driver;
			
	File source =ts.getScreenshotAs(OutputType.FILE);
	String Random = RandomString.make(5);		
	String destination = System.getProperty("user.dir")+"//FailedTesCasesScreenShot//"+testCaseName+""+Random+".png";
	
	FileUtils.copyFile(source, new File(destination));
	
	return destination;
	
}
}
