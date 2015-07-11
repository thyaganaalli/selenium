package com.Ecareautomation.testNg;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//import atu.testrecorder.ATUTestRecorder;


public class JavaScriptExecutor {
	public WebDriver driver;
//	public ATUTestRecorder recorder;

  @Test
  public void f() throws Throwable {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  /*js.executeScript("window.scrollBy(0,800)", "");
	  Thread.sleep(40000);
	  
	  //To scroll up web page by 300 pixels In x(vertical) direction.
	  js.executeScript("window.scrollBy(0,-100)", "");*/
//	  enter in textbox using javascript
	  js= ((JavascriptExecutor)driver);
		((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='raju'");
		driver.findElement(By.id("email")).click();
//	  driver.findElement(By.id("email")).click();
//	  use robot classs
	  /*Robot rt=new Robot();
	  rt.keyPress(KeyEvent.VK_CAPS_LOCK);
	  rt.keyPress(KeyEvent.VK_L);
	  rt.keyRelease(KeyEvent.VK_L);
	  rt.keyPress(KeyEvent.VK_I);
	  rt.keyRelease(KeyEvent.VK_I);
	  rt.keyPress(KeyEvent.VK_2);
	  rt.keyRelease(KeyEvent.VK_2);*/
	  

	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
//	   recorder = new ATUTestRecorder("D:\\ScriptVideos\\","TestVideo-",false);
	  //To start video recording.
//	  recorder.start(); 
	  driver =new FirefoxDriver();
	  driver.get("http://www.facebook.com");
//	  driver.get("http://only-testing-blog.blogspot.in");
	  driver.manage().window().maximize();
//	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws Exception {
	  driver.quit();
//	  recorder.stop();
  }

}
