package qsp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTRLIST {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ameen%20Shaik/OneDrive/Desktop/foodi.html");
		WebElement mtrbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrbox);
		List<WebElement> allopt = s.getOptions();
		int count = allopt.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--) {
			s.deselectByIndex(i);
			
		}
		driver.close();

	}

}
