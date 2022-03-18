package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusDataPicker_Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String year = "2022";
		String month= "Apr";
		String date = "21";
		d.findElement(By.id("onward_cal")).click();
		
		while(true) {
			
			String monthyear = d.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			String arr[] = monthyear.split(" ");
			
			String mon = arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break;
			}
			else {
				
				d.findElement(By.xpath("//td[@class='next']")).click();
			}
			
		}
		List<WebElement> alldates = d.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for(WebElement ele:alldates) {
			String dt = ele.getText();
		if(dt.equals(date)) {
						
			ele.click();
			
		}
		
		}
	
		 
	}

}
