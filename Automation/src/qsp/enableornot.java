package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enableornot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 boolean enable = driver.findElement(By.name("login")).isEnabled();
		 if (enable==true) {
			 System.out.println("login  button is pass");
		 }
		 else {
			 System.out.println("login button is fail");
		 }
           driver.close();
	}

}
