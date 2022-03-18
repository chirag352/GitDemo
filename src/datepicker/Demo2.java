package datepicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		String month = "April 2022";
		int date = 22;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		
		
		////*[@id="checkin"]
		while(true) {
			String desiremonth= driver.findElement(By.xpath("//th[@class='datepicker-switch']")).getText();
			
			if(desiremonth.equals(month)) {
				break;
			}
			
			else {
				///html/body/div[3]/div[1]/table/thead/tr[1]/th[3]
				
				driver.findElement(By.xpath("//th[@class='next']")).click();
			}
		}
		
		  List<WebElement> desiredate = driver.findElements(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']"));
		 int sizeofdate = desiredate.size();
		 
		 for(int i=1; i<sizeofdate; i++) {
			 
			 if(desiredate.equals(date)) {
				 desiredate.get(i).click();
			 }
			 
			
			 
			 
		 }
			/*
			 * while(true) {
			 * 
			 * desiredate.get(0) if(desiredate.equalsIgnoreCase(date)) {
			 * driver.findElement(By.
			 * xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']"
			 * )).click();
			 * 
			 * } Thread.sleep(3000); driver.close();
			 * 
			 * }
			 */
	
	}



	}


