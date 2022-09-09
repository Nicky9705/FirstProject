package org.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicky\\eclipse-workspace\\NidhiSingh\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("http://gmail.com/");
		
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.out.println("tittle is"+a);
		
		String b = driver.getCurrentUrl();
		System.out.println("current url is"+b);
		
	}

	

}
