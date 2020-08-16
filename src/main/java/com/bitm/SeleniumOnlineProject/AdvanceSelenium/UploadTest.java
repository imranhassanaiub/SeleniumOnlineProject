package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Imran\\Desktop\\test.csv");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		System.out.println("File has been Uploaded!");

	}

}
