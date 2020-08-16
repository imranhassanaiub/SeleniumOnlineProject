package com.bitm.SeleniumOnlineProject.AdvanceSelenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManager {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		// Capture All cookies from the browser/webapp
		Set<Cookie> cookies=driver.manage().getCookies(); 
		System.out.println("Size of cookies: "+cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName() +" :- "+ cookie.getValue() );
		}
		
		System.out.println("------------------------------------");
		//Get a Specifiq cookie
		System.out.println(driver.manage().getCookieNamed("session-id"));
		System.out.println("------------------------------------");
		//Adding new cookies
		
		Cookie newcookie= new Cookie("NewCookie","SeleniumTest");
		driver.manage().addCookie(newcookie);
		System.out.println(newcookie);
		System.out.println("------------------------------------");
		cookies=driver.manage().getCookies();
		System.out.println("New Size of cookies: "+cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName() +" :- "+ cookie.getValue() );
		}
		System.out.println("------------------------------------");
		
		//Deleting a specifiq cookie
		//driver.manage().deleteCookieNamed("NewCookie");
		driver.manage().deleteCookie(newcookie);
		cookies=driver.manage().getCookies();
		System.out.println("New Size of cookies: "+cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName() +" :- "+ cookie.getValue() );
		}
		System.out.println("------------------------------------");
		
		//deleting all cookies
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("New Size of cookies: "+cookies.size());
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName() +" :- "+ cookie.getValue() );
		}
		System.out.println("------------------------------------");
		
	}

}
