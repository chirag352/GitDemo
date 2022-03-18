package scrollTables;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollWithinTables {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr//td[4]"));
		
		int sum= 0;
		
		for(int i=0; i<values.size();i++) {
			
			 sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		String total = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	    int totalAmt =  Integer.parseInt(total);
	  Assert.assertEquals(sum, totalAmt);
	System.out.println("Test passed");
	}
}
