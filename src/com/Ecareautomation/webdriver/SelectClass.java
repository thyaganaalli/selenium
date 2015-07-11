package com.Ecareautomation.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.xpath("//select[@id='Carlist']"));
		Select sel=new Select(wb);
		
		WebElement str=sel.getFirstSelectedOption();
		System.out.println("default text is"+str.getText());
//		List<WebElement> lt=sel.getOptions();
//		sel.selectByIndex(lt.size()-1);
		/*int size=lt.size();
		for (int i = 0; i <size; i++) {
			String s=sel.getOptions().get(i).getText();
			System.out.println(s);
			
		}*/
		/*for(WebElement E:lt){
			System.out.println(E.getText());
		}*/
//		without using select values
		/*List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='Carlist']//option")); //get all the options from the dropdown
	    System.out.println("last option is"+allOptions.get(allOptions.size()-2).getText());*/ 


	}


	

}
