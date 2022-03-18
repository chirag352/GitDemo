package SeleniumNewFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class InvokingNewTabs {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/angularpractice/");
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		

	}

}
