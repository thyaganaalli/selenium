package com.Ecareautomation.testNg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;


public class log4j {
	private static WebDriver driver;
	private static Logger log=Logger.getLogger(log4j.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		 
		// Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        log.info("New driver instantiated");
        driver.get("http://book.spicejet.com/");
        log.info("browser is launched");
        driver.manage().window().maximize();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        log.info("Implicit wait applied on the driver for 10 seconds");
        
       /*WebElement ele= driver.findElement(By.xpath(".//*[@id='smoothmenu1']/ul/li[6]/a"));
       Actions act=new Actions(driver);
       act.moveToElement(ele).build().perform();
       
       log.info("action is move to Travel info");
       driver.findElement(By.linkText("Citizen's Charter")).click();
       log.info("sub link is clicked");*/
       driver.close();
       log.info("browser is closed");

	}


	

}
