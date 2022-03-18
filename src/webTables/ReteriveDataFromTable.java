package webTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReteriveDataFromTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=4000");

		int rows = d.findElements(By.xpath("//div[@class='tableFixHead']//tbody//tr")).size();
		System.out.println(rows);

		for (int r = 1; r <= rows; r++) {
			String lan = d.findElement(By.xpath("//div[@class='tableFixHead']//tbody//tr[" + r + "]//td[1]")).getText();
			if (lan.equals("Jack")) {
				String position = d.findElement(By.xpath("//div[@class='tableFixHead']//tbody//tr[" + r + "]//td[2]"))
						.getText();
				String City = d.findElement(By.xpath("//div[@class='tableFixHead']//tbody//tr[" + r + "]//td[3]"))
						.getText();
				System.out.println(position);
				System.out.println(City);
			}

		}

		// div[@class='tableFixHead']//tbody//tr[1]//td[1]
		d.quit();

	}
}
