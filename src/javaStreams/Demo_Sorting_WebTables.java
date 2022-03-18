package javaStreams;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo_Sorting_WebTables {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.findElement(By.xpath("//table[@class='table table-bordered']//tr//th[1]")).click();
		List<WebElement> elementList = d.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr//td[1]"));
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
	Assert.assertTrue(originalList.equals(sortedList));
	System.out.println("Test Passed");
	}

}
