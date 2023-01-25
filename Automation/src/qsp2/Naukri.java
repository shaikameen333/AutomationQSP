package qsp2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/multiplewindows/");
driver.findElement(By.name("newbrowserwindow123")).click();
driver.findElement(By.name("newbrowserwindow123")).click();
Set<String> wh = driver.getWindowHandles();
for(String al:wh) {
	driver.switchTo().window(al);
	driver.close();
}

}

	}


