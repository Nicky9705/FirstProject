package org.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicky\\eclipse-workspace\\NidhiSingh\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.out.println("title is"+a);
		
		String b = driver.getCurrentUrl();
		System.out.println("current url"+b);
		
	}

}
