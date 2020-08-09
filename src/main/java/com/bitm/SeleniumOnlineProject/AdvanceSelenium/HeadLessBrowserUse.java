package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowserUse {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Title Check
		System.out.println("Page title is :" + driver.getTitle());

		// Admin Login
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

		// Click On
		driver.findElement(
				By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img"))
				.click();
		System.out.println("Clicked on ASSIGN LEAVE");
		System.out.println("Executed through HtmlUnit Driver");
	}

}
