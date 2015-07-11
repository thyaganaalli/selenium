package com.Ecareautomation.testNg;

import java.io.File;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ietest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\Library\\IEDriverServer.exe");
		System.setProperty("Webdriver.ie.driver",file.getAbsolutePath() );
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

	}

}
