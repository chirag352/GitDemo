package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Datapicker_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("the selected date before "+d.findElement(By.id("dob")).getText());
		Thread.sleep(2000);
		d.findElement(By.id("dob")).click();
		Select month = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Apr");

		Thread.sleep(2000);

		Select year = new Select(d.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("1995");
		Thread.sleep(2000);
		
		String date = "21";
		/*
		 * Assert.assertEquals("1995",d.findElement(By.xpath(
		 * "//select[@class='ui-datepicker-year']")).isDisplayed()); Thread.sleep(2000);
		 */
		
		List<WebElement> alldate = d.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for( WebElement ele:alldate) {
			
			String dt = ele.getText();
			
			if(dt.equals(date)) {
				
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		 d.findElement(By.id("dob")).click();
		
		Thread.sleep(2000);
		d.close();
	}

}
