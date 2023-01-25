package qsp2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookbirth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("21");

		WebElement month = driver.findElement(By.id("month"));
		Select a=new Select(month);
		a.selectByVisibleText("Jun");

		WebElement year = driver.findElement(By.id("year"));
		Select g=new Select(year);
		g.selectByValue("1999");
		Thread.sleep(5000);
		driver.close();





	}

}
