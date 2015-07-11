package com.Ecareautomation.testNg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Facebooklogin {
	public WebDriver driver;
	
  
  @BeforeTest
  public void beforeTest() throws Throwable {
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		driver.get("http://www.facebook.com");
		DesiredCapabilities capability1 = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		WebDriver driver1=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		driver.get("http://www.facebook.com");
	  
	  
  }
  @Test
  public void login() {
	  System.out.println("i am in login method");
	  
  }
  @Test
  public void A() {
	  System.out.println("i am in A method");
	  
  }
  @Test
  public void B() {
	  System.out.println("i am in B method");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
