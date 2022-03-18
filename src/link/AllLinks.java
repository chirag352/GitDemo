package link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AllLinks {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement>  links = d.findElements(By.xpath("//div[@id='gf-BIG']//td//li//a"));
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection  conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode= conn.getResponseCode();
			
			if(respCode>400) {
				System.out.println("the link with text "+ link.getText()+ " is broken with code "+respCode);
				Assert.assertTrue(false);
			}
		}
		
		d.close();
	}

}
