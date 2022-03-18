package action;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://rahulshettyacademy.com/loginpagePractise/#");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows = d.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		d.switchTo().window(childID);
		System.out.println(d.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailID = d.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);
		d.switchTo().window(parentID);
		d.findElement(By.id("username")).sendKeys(emailID);
	}

}
