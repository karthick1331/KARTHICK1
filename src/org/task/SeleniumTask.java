package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\#Browser Driver\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String current = driver.getCurrentUrl();
	System.out.println(current);
	
	driver.get("http://gmail.com/");
	driver.manage().window().maximize();
	String title2 = driver.getTitle();
	System.out.println(title2);
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println(currentUrl2);
	
	driver.get(" http://www.flipkart.com/");
	driver.manage().window().maximize();
	String title3 = driver.getTitle();
	System.out.println(title3);
	String current3 = driver.getCurrentUrl();
	System.out.println(current3);
	
	  //clonning process
	 //Action
			
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
