package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://nxtgenaiacademy.com/multiplewindows/.");
     driver.findElement(By.name("newbrowserwindow123")).click();
     Thread.sleep(5000);
     driver.findElement(By.name("newbrowserwindow123")).click();
     Set<String> allwh = driver.getWindowHandles();
     int count = allwh.size();
     System.out.println(count);
     driver.quit();
     
	}

}
