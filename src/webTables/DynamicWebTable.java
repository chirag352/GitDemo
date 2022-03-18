package webTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.clear();
		pass.sendKeys("demo");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		driver.findElement(By.xpath("//li[@id='menu-sale']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse26']//li[1]//a")).click();

		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("window.scrollBy(0,1000)");

		/*
		 * String Nopages =
		 * driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText()
		 * .split("Pages")[0].split("11210")[1].split(" ")[1];
		 * 
		 * Sys
		 */
		String Nopages = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(Nopages);

		Nopages.indexOf("(");
		Nopages.indexOf("Pages");
		int text = Integer.parseInt(Nopages.substring(Nopages.indexOf("(") + 1, Nopages.indexOf("Pages") - 1));
		System.out.println(text);
		
		for (int p=1; p<=5; p++) {
			WebElement active_page= driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			System.out.println("Active page:" +active_page.getText());
			active_page.click();
			
			int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("Number of rows: "+ rows);
			
			for(int r=1; r<=rows; r++) {
				String OrderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String Customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
			
				if(Status.equals("Pending")) {
					System.out.println(OrderID+"     "+Customer+"     "+Status);
				}
			}
			
			
			
			String nextpages = Integer.toString(p+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+nextpages+"']")).click();
			
			
			
			
		}

		driver.close();

	}

}
