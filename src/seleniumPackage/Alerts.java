package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		String name = "Chirag";

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.id("name")).sendKeys(name);
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(1000);
		// System.err.println((d.switchTo().alert().getText()));

		String mess = d.switchTo().alert().getText();
		System.out.println(mess);
		String[] value = mess.split(",");
		System.out.println(value[0]);
		String ab = value[0];
		
		if(ab.equalsIgnoreCase("Hello "+name)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Fail test");
		}
		d.switchTo().alert().accept();
		
		Thread.sleep(1000);
d.quit();
		/*
		 * while (true) {
		 * 
		 * String[] messga = mess.split(","); String name1 = messga[1]; //String name2 =
		 * messga[2]; //String name3 = messga[3];
		 * 
		 * String name4 = name1;
		 * 
		 * if (name4.equals("Hello"+name)) { System.out.println("Test Name is pass");
		 * Assert.assertTrue(true); } else {
		 * System.out.println("Test Name is not pass"); Assert.assertTrue(false);
		 * 
		 * } }
		 */
	}
	
	
}
