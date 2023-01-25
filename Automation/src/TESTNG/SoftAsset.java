package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAsset {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String ExpetedTitle = "google";
	String ActualTitle = driver.getTitle();
	if(ActualTitle.equals(ExpetedTitle)) {
		Reporter.log("Title is matching & pass");
	}
		else {
			Reporter.log("Title is not matching & fail");
		}
	driver.close();
	}

}

