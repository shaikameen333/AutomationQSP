package qsp;

import java.sql.Driver;
import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

public class PrintAllLinks {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.amazon.in/");
      List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
      int count = alllinks.size();
      System.out.println(count);
      String text = alllinks.get(0).getText();
      System.out.println(text);
      driver.close();
	} 
}
