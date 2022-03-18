package scrollTables;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTable_GetValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		List<WebElement> eleList;
		List<String> price;
		d.findElement(By.xpath("//th[@aria-sort='descending']")).click();
		do{eleList = d.findElements(By.xpath("//table[@class='table table-bordered']//tbody//tr//td[1]"));
		 price = eleList.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeg(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			d.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}

		}while(price.size()<1);
		
	}
	
	private static String getPriceVeg (WebElement s) {
		String pricevalue =s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return pricevalue;
	}

}
