package com.Ecareautomation.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class perfomAction {
	public WebDriver driver;
	public void Action(){
		driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("submitButton")).click();;
		driver.switchTo().alert().accept();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perfomAction ac=new perfomAction();
		ac.Action();
	}
}
		


	


