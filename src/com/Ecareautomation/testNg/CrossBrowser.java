package com.Ecareautomation.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CrossBrowser {
  @Test
  @Parameters("Browser")
	  public  void test1(String browser) {
	   
	  if(browser.equalsIgnoreCase("FF")){
	   
	  WebDriver driver=new FirefoxDriver();
	   
	  driver.manage().window().maximize();
	   
	  driver.get("http://www.facebook.com");
	   
//	  driver.quit();
	   
	  }
	  else if(browser.equalsIgnoreCase("chrome")){
	   
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	   
	  WebDriver driver=new ChromeDriver();
	   
	  driver.manage().window().maximize();
	   
	  driver.get("http://www.facebook.com");
	   
//	  driver.quit();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
