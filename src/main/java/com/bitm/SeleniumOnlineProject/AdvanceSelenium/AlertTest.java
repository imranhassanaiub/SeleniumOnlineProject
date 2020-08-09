package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		
		//Alert
		// 1. Switching to alert
		Alert alert= driver.switchTo().alert();
	
		// Capturing alert Message
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		//Accepting the Alert
		//alert.accept();
		
		//Dismissing an alert
//		alert.dismiss();
		
		// Sent some data to alert box
		driver.switchTo().alert().sendKeys("XYZ");
	}

}
