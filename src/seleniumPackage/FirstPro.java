package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.globalsqa.com/demo%20site/");
		
		// If we want the title of the page then we can use the following method i.e. getTitle
		
		System.out.println(d.getTitle());
		
		// If we want to see the url of the page then we can use getCurrentUrl method
		
		System.out.println(d.getCurrentUrl());
		
		d.close();
		
		d.quit();
	}

}
