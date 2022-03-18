package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		
		ChromeDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		d.quit();
		
		
	}
}
