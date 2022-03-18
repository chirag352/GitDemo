package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractPass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium standalone file\\New folder\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		String Pass = getPSW(w);
		w.get("https://rahulshettyacademy.com/locatorspractice/");
		w.manage().window().maximize();
		w.manage().deleteAllCookies();
		w.findElement(By.xpath("(//a[@href='#'])[3]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		w.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
		w.findElement(By.xpath("//input[@type='password']")).sendKeys(Pass);
		w.findElement(By.xpath("//input[@type='checkbox']")).click();
		w.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		w.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		w.close();
		
		
		
	}
	
	public static String  getPSW(WebDriver w) throws InterruptedException {
		w.get("https://rahulshettyacademy.com/locatorspractice/");
		w.findElement(By.xpath("(//a[@href='#'])[3]")).click();
		Thread.sleep(3000);
		w.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		String getPW = w.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] passArray = getPW.split("'");
		
		//Please use temporary password - index 0
		//rahulshettyacademy' to Login. - index 1
		
		String passwords = passArray[1].split("'")[0];
		
		return passwords;
		
		//rahulshettyacademy' to Login. 
		//rahulshettyacademy - index 0
		// to Login. -index 1
		
		
		
	}
}
