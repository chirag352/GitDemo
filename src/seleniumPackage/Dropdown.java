package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
			WebDriver a = new ChromeDriver();
			
			a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			a.get("https://rahulshettyacademy.com/dropdownsPractise/");
			a.manage().window().maximize();
			a.manage().deleteAllCookies();
			
			Thread.sleep(2000);
			
			WebElement staticdropdown = a.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Thread.sleep(2000);
			Select dropdown = new Select(staticdropdown);
			dropdown.selectByIndex(3);
			Thread.sleep(2000);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			dropdown.selectByVisibleText("AED");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			Thread.sleep(2000);
			dropdown.selectByValue("INR");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			a.close();
		}

	}


