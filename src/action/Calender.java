package action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).getText().contains("May 2022")) 
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day']"));
	int countofdates = dates.size();
	
	for(int i=0; i<countofdates; i++) {
		String textdate = driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
if(textdate.equalsIgnoreCase("22")) {
	driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
	break;
}
	}
	}

}
