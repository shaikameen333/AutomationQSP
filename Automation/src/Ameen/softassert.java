package Ameen;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void verifytitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String extitle = "soogle";
	String attitle = driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(attitle,extitle);
	driver.close();
	s.assertAll();
}
}
