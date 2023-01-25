package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsset_4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void HardAssettitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String ExpetTitle = "noodles";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpetTitle);
		driver.close();
	}

}
