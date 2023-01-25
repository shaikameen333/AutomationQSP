package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup5 {
		static {
			System.setProperty("weebdriver.chrome.driver","./driver/chromedriver.exe");
		}
			public static void main(String[] args) {
				WebDriver driver=new ChromeDriver();
				driver.get("https://nxtgenaiacademy.com/multiplewindows/.");
				driver.findElement(By.name(null)).click();
				driver.findElement(By.name(null)).click();
				Set<String> allwh = driver.getWindowHandles();
		        for(String wh:allwh) {
		        	driver.switchTo().window(wh);
		        	driver.close();
	}

			}
}
