package com.Ecareautomation.webdriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class way2sms {
	public WebDriver driver;
	public WebDriverWait wait;
	public void login() throws Exception{
		driver=new FirefoxDriver();
		driver.get("http://www.way2sms.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		Set<String> str=driver.getWindowHandles();
		Iterator<String> it=str.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("8686750597");
		driver.findElement(By.id("password")).sendKeys("9989");
		driver.findElement(By.id("loginBTN")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='traphead']/div[1]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Set<String> str1=driver.getWindowHandles();
		Iterator<String> it1=str1.iterator();
		String parent1=it1.next();
		String child1=it1.next();
		driver.switchTo().window(child1);
		driver.close();
		
		
	}

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		way2sms ws=new way2sms();
		ws.login();

	}


	

}
