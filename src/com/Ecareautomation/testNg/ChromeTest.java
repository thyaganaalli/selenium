package com.Ecareautomation.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	public WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  System.out.println("driver is launched");
	  
	  
  }
}
