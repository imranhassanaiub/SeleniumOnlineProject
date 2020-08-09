package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUPTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		//PopUp Handling
		String MainWindow = driver.getWindowHandle();
		
		// Handle Other Windows
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itiration = windows.iterator();
		
		while(itiration.hasNext())
		{
			String ChildWindow = itiration.next();
						
			if(!MainWindow.equalsIgnoreCase(ChildWindow)) {
				
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"))
				.sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
				System.out.println("Second Page/PopedUP page Handled");
			}
			
		}
		
		driver.switchTo().window(MainWindow);
		System.out.println("Back To Main Window");

	}
}
