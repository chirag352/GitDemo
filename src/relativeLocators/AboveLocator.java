package relativeLocators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class AboveLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.rahulshettyacademy.com/angularpractice/");
		d.manage().deleteAllCookies();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement nametxt= d.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
		//d.findElement(By.tagName("label").above(nametxt));
	}

}
