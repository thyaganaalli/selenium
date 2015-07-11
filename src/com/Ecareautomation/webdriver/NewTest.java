package com.Ecareautomation.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
	  @Test
	  public void f() {
		  WebElement ele=driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select"));
		  Select sel=new Select(ele);
		  System.out.println("select is multiple"+sel.isMultiple());
		  if(sel.isMultiple()){
			  sel.selectByIndex(2);
			  sel.selectByVisibleText("Mexico");
			  sel.selectByVisibleText("Italy");
			  sel.selectByIndex(3);
			  driver.findElement(By.xpath(".//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
		  }
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://only-testing-blog.blogspot.in");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }


}
