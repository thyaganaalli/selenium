package com.Ecareautomation.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class AdvanceReporting {
  @Test
  public void facebooklog() {
	  ExtentReports extent=ExtentReports.get(AdvanceReporting.class);
	  extent.init("E:\\myReport\\myreport.html", true);
	  extent.startTest("verift Test");
	  WebDriver driver=new FirefoxDriver();
	  
      driver.manage().window().maximize();

      extent.log(LogStatus.INFO, "Browser started");



      // Open application

      driver.get("http://www.facebook.com");

      extent.log(LogStatus.INFO, "Navigated to www.facebook.com");
      String title=driver.getTitle();
      
      extent.log(LogStatus.INFO, "Go to Facebook Home");
      Assert.assertTrue(title.contains("Facebook"));
      
      extent.log(LogStatus.PASS, "Title verified");

      extent.attachScreenshot("E:\\myReport\\image1.jpg");
      driver.quit();
      extent.log(LogStatus.INFO, "Browser closed");
      extent.endTest();
  }
}
