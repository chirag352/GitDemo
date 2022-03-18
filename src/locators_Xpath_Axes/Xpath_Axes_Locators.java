package locators_Xpath_Axes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes_Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().deleteAllCookies();

		// Self
		String selfText = d.findElement(By.xpath("//td[contains(text(),'Strawberry')]/self::td")).getText();
		System.out.println(selfText);

		// parent

		String parentText = d.findElement(By.xpath("//td[contains(text(),'Strawberry')]/parent::tr")).getText();
		System.out.println(parentText);

		// child

		List<WebElement> childText = d
				.findElements(By.xpath("//td[contains(text(),'Strawberry')]/parent::tr/child::td"));
		System.out.println("Size of Child " + childText.size());

		// ancestor

		String ancestorText = d.findElement(By.xpath("//td[contains(text(),'Strawberry')]/parent::tr/child::td[2]/ancestor::tr"))
				.getText();
		System.out.println("The ancestor value is: "+ancestorText);

		
		//Descendant
		
		List<WebElement> descendantText= d.findElements(By.xpath("//table[@class='table table-bordered']/descendant::*"));
	    System.out.println("The size of descendant is "+ descendantText.size());
	
	//Following
	    
	  String follText = d.findElement(By.xpath("//td[contains(text(),'Strawberry')]/parent::tr/following::*")).getText();
System.out.println("Followint Text is "+follText);

//following-sibling

   List<WebElement> FollSibText = d.findElements(By.xpath("//td[contains(text(),'Strawberry')]/parent::tr/following-sibling::*"));

System.out.println("Follow-sibling number "+ FollSibText.size());
	
	}

}
