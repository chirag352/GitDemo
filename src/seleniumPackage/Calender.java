package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//d.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		Thread.sleep(1000);
		if (d.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
		
		{
			System.out.println("Is enabled");
			Assert.assertTrue(true);
		}
		
		else {
			Assert.assertTrue(false);
		}
		
		
		
		d.close();
		
		
	}
}
