package Ameen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asserthard {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testverifytitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String etitle = "google";
		String atitle = driver.getTitle();
		if(atitle.equals(atitle)) {
			Reporter.log("title is passed",true);
		}
		else {
			Reporter.log("title is passed",true);
		}
	}
}
