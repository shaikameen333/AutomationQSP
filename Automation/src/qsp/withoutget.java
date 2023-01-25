package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutget {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Driver.navigate().to("http://gmail.com/");
		Thread.sleep(2000);
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();
		Thread.sleep(2000);
		Driver.navigate().refresh();
		Thread.sleep(2000);
		Driver.quit();
	}

}
