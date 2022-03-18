package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		
		WebDriver w = new ChromeDriver();
		
		//a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		w.get("https://opensource-demo.orangehrmlive.com/");
		
		w.manage().window().maximize();
		
		w.manage().deleteAllCookies();
		
		 WebElement UN = w.findElement(By.xpath("//input[@id='txtUsername']"));
		 
		 
		 
		 Assert.assertTrue(UN.isDisplayed());
		 
		 Thread.sleep(2000);
		 
		 UN.sendKeys("Admin");
		 Thread.sleep(2000);
		 
		 WebElement PW = w.findElement(By.xpath("//input[@id='txtPassword']"));
		 
		 Assert.assertTrue(PW.isDisplayed());
		 
		 Thread.sleep(2000);
		 
		 PW.sendKeys("admin123");
		 Thread.sleep(2000);
		 
		 WebElement LN = w.findElement(By.xpath("//input[@id='btnLogin']"));
		 
		 Thread.sleep(2000);
		 
	
		 
		 LN.click();
		 
		 //w.close();
		
		
		
		
		
	}

}
