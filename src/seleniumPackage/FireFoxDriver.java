package seleniumPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium standalone file\\New folder\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		d.quit();
		
		
		
		
		
	}
}
