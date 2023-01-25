package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifylogoisdisplayed {
     static {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   	boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook\']")).isDisplayed();
		if (logo==true) {
			System.out.println("facebooklogo is displayed");
		}
		else {
			System.out.println("face book logo is not displayed");
		}
		driver.close();
	}
}
