package webTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,500)");
		
		// How many rows?
		int rows = d.findElements(By.xpath("//table[@id='product' and @class='table-display']//tbody//tr")).size();
		System.out.println("Number of rows in a table:= "+rows);
		
		// How many columns?
		int colm = d.findElements(By.xpath("//table[@id='product' and @class='table-display']//tbody//tr//th")).size();
		System.out.println("Number of Column in a table:= "+colm);
		
		// How to extract value from particular column and row
		String values= d.findElement(By.xpath("//table[@id='product' and @class='table-display']//tbody//tr[3]//td[2]")).getText();
		System.out.println("The value of table is: "+ values);
		
		for(int r=2; r<=rows; r++) {
			
			for(int c=2; c<=colm; c++) {
				
				 String data = d.findElement(By.xpath("//table[@id='product' and @class='table-display']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(data +"     ");
			}
			
			System.out.println();
		}
		
		d.close();
	}

}
