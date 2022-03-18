package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://jqueryui.com/droppable/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		System.out.println(d.findElements(By.tagName("iframe")).size());
		d.switchTo().frame(0);
		//d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//d.findElement(By.id("draggable")).click();
		
		
		 Actions a = new Actions(d); WebElement sourcee =
		 d.findElement(By.id("draggable")); WebElement targett =
		  d.findElement(By.id("droppable")); a.dragAndDrop(sourcee, targett);
		 
	}

}
