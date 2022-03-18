package seleniumPackage;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\Selenium standalone file\\msedgedriver.exe");
		EdgeDriver d = new EdgeDriver();
		d.get("https://www.google.co.in/");
		Thread.sleep(2000);
		d.quit();
	}

}
