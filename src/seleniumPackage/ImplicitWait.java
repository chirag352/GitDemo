package seleniumPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		g.get("https://www.google.com/");
		g.manage().window().maximize();
		g.manage().deleteAllCookies();
		g.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
