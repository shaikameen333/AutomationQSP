package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OPrintHeightandWeidth {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement tbx = driver.findElement(By.id("email"));
	int height = tbx.getSize().getHeight();
	int weidth = tbx.getSize().getWidth();
	System.out.println(height);
	System.out.println(weidth);
	driver.close();
}
}
