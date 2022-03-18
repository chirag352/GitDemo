package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo1 {
	
	

	public static void main(String[] args) {
		String month = "April 2022";
		String date = "01";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("checkin")).click();
		
		String desiremonth= driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//th[@class='switch']")).getText();
		////*[@id="checkin"]
		
		while(true) {
			
			if(desiremonth.equals(month)) {
				break;
			}
			
			else {
				///html/body/div[3]/div[1]/table/thead/tr[1]/th[3]
				
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[3]")).click();
			}
		}
		while(true) {
String desiredate = driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']")).getText();
	if(desiredate.equals(date)) {
		driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']")).click();
	}
	}

}}
