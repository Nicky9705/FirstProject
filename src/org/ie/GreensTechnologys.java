package org.ie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GreensTechnologys {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedgedriver.driver","C:\\Users\\nicky\\eclipse-workspace\\NidhiSingh\\drivers\\msedgedriver.exe");
		 
	      WebDriver driver = new InternetExplorerDriver();
	       
	      driver.get("http://www.greenstechnologys.com/");
	      
	      driver.manage().window().maximize();
	      
	      String a = driver.getTitle();
	      System.out.println("title is"+a);
		 
	      String b = driver.getCurrentUrl();
	      System.out.println("current url"+b);
		 
		 
	}

}
