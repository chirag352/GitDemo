package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions a = new Actions(driver);
		WebElement copyEle = (driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
		 a.moveToElement(copyEle).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		 //System.out.println(copyEle.isSelected());
	}

}
