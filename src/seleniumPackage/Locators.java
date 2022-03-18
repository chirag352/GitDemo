package seleniumPackage;

//import java.time.Duration;
import java.util.concurrent.TimeUnit;

//import org.graalvm.compiler.debug.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import com.sun.tools.javac.util.Assert;

public class Locators {
static String name1 = "rahul";
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		a.get("https://rahulshettyacademy.com/locatorspractice/");

		a.manage().window().maximize();

		a.manage().deleteAllCookies();

		WebElement userName1 = a.findElement(By.id("inputUsername"));

		WebElement password1 = a.findElement(By.name("inputPassword"));

		// Assert.assertTrue(userName1.isDisplayed());

		userName1.sendKeys("John");

		password1.sendKeys("svcfj");

		a.findElement(By.className("signInBtn")).click();

		// Thread.sleep(5000);

		System.out.println(a.findElement(By.cssSelector("p.error")).getText());

		// Thread.sleep(2000);

		a.findElement(By.linkText("Forgot your password?")).click();

		// .sleep(2000);

		a.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John Cena");

		a.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("JohnCena@gmail.com");

		Thread.sleep(3000);

		a.findElement(By.xpath("//input[@placeholder='Email']")).clear();

		Thread.sleep(2000);

		a.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("JohnCena234@gmail.com");

		a.findElement(By.xpath("//form/input[3]")).sendKeys("9898555500");

		a.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();

		System.out.println(a.findElement(By.xpath("//p[@class='infoMsg']")).getText());

		a.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();

		Thread.sleep(2000);

		a.findElement(By.id("inputUsername")).sendKeys(name1);

		a.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		a.findElement(By.xpath("//input[@id='chkboxOne']")).click();

		a.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

		System.out.println(
				a.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']"))
						.getText());

		Assert.assertEquals((a.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']"))
				.getText()),
				"You are successfully logged in.");

		Thread.sleep(2000);
		
		Assert.assertEquals(a.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+name1+",");
		

		a.close();
	}

}
