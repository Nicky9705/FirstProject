package org.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook { 
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nicky\\eclipse-workspace\\NidhiSingh\\drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.out.println("title is"+a);
		
		String b = driver.getCurrentUrl();
		System.out.println("current url is"+b);
				
	}

}
