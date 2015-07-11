package com.Ecareautomation.testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PerformAction {
	public WebDriver driver;
  @Test
  public void f() {
	  	driver.findElement(By.id("submitButton")).click();;
		driver.switchTo().alert().accept();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  	driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		driver.manage().window().maximize();
		

  }

  @AfterTest
  public void afterTest() {
  }

}
