package greenKart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitKartEx {

	public static void main(String[] args) throws InterruptedException {
		String[] items = { "Brocolli", "Cucumber", "Beetroot" };

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver g = new ChromeDriver();
		g.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		g.manage().window().maximize();
		g.manage().deleteAllCookies();
		g.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		implicitKartEx t =new implicitKartEx();
		t.additems(g, items);
		
		g.findElement(By.xpath("//img[@alt='Cart']")).click();
		//Thread.sleep(3000);
		g.findElement(By.xpath("//div[@class='cart-preview active']//button[@type='button']")).click();
		//Thread.sleep(3000);
		g.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		//g.close();

	}

	public void additems(WebDriver g, String[] items) {
		int j = 0;
		List<WebElement> products = g.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// System.out.println(name[0]);
			// System.out.println(name.length());

			String formattedName = name[0].trim();

			List itemneededlist = Arrays.asList(items);

			if (itemneededlist.contains(formattedName)) {

				j++;

				g.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == items.length) {
					break;
				}
			}

		}
	}



	}


