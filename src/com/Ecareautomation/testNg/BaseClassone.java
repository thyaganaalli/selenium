package com.Ecareautomation.testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class BaseClassone {
	public static WebDriver driver = new FirefoxDriver();
  @Test
  public void f() {
	  System.out.println("i am in base class");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  }
  @AfterTest
  public void teardown(){
	  driver.quit();
  }

}
