package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.utility.RandomString;

public class ExtentReportNG {

	

	static ExtentReports extent ;
    
	
	   public static ExtentReports getReportObject() {
		   
		   String path =System.getProperty("user.dir")+"\\reports\\index.html";
		   ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
			reporter.config().setReportName("4 Jun Framework Results");
			reporter.config().setDocumentTitle("Automation Execution Results");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("QA Automation Engineer", "Ishwar Bittewar");
		   
		   
		return extent;
		   
	   }
}
