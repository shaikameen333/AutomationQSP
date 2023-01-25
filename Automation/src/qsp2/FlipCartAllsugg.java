package qsp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartAllsugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allauto = driver.findElements(By.name("q"));
		int count = allauto.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allauto.get(i).getText();
			System.out.println(text);
		}
		allauto.get(count-1).click();
		driver.close();
	}

}
