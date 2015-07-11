package com.Ecareautomation.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class priority {
	@Test(priority=3)
	  public void A() {
		  System.out.println("i am first method");
	  }
	  @Test(priority=5)
	  public void B(){
		  System.out.println("i am second method");
	  }
	  @Test(priority=1)
	  public void C(){
		  System.out.println("i am third method");
	  }
	  @Test(priority=4)
	  public void D(){
		  System.out.println("i am fourth method");
	  }
	  @Test(priority=2)
	  public void E(){
		  System.out.println("i am in fifth method");
	  }

  @BeforeTest
  public void beforeTest() {
	  WebDriver driver=new FirefoxDriver();
  }

 

}
