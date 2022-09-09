package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnogogy2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nicky\\eclipse-workspace\\NidhiSingh\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.out.println("tittle is"+a);
		
		String b = driver.getCurrentUrl();
		System.out.println("current url is"+b);
	}

}
