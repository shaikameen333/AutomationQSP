package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.linkText("actiTIME Inc.")).click();
     Thread.sleep(5000);
     Set<String> wh = driver.getWindowHandles();
     int count = wh.size();
     System.out.println(count);
     driver.quit();
	}

}
