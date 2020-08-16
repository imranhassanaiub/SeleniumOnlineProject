package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement downloadbtn = driver.findElement(By.id("messenger-download"));
        String sourcelocation= downloadbtn.getAttribute("href");
        
        String wgetcommand= "cmd /c C:\\Wget\\wget.exe -P C:\\Users\\Imran\\Desktop\\DownloadedFiles --no-check-certificate "+sourcelocation;
	 
        try {
			Process execution = Runtime.getRuntime().exec(wgetcommand);
			int exitvalue=execution.waitFor();
			
			System.out.println("Exit Value: "+exitvalue);
			System.out.println("File has been Downloaded Successfully!!");
        	
		} catch (Exception e) {
			
			System.out.println(e.toString());
		}
	}

}
