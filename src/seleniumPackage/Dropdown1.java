package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		
		WebDriver s = new ChromeDriver();
		
		s.manage().window().maximize();
		s.manage().deleteAllCookies();
		s.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		s.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		System.out.println("Before starting the code "+s.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		for (int i=1;i<5;i++) {
			
			s.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			
		}
		Thread.sleep(2000);

		
		s.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		Thread.sleep(2000);
		System.out.println("After the code "+s.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		
		s.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		s.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BOM']")).click();
		Thread.sleep(2000);
		s.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		
		
		s.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = s.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		
		for( WebElement option:options) {
			
			
			if(option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
				
			}
			
			
		}
		System.out.println("Before click "+s.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		s.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println("After Click "+s.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Thread.sleep(2000);
		System.out.println("Count of checkbox is "+s.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();

	}

}
