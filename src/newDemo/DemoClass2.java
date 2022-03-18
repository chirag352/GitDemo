package newDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://confluence.atlassian.com/");
	driver.close();

	}

}
