package qsp2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		Set<String> tabs = driver.getWindowHandles();
           int count = tabs.size();
           Thread.sleep(5000);
           System.out.println(count);
           driver.quit();
			
		}

	}

