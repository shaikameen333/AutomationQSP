package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Valid1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
 @Test
 public void testvalidlogin() {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 LoginPage1POM L=new LoginPage1POM(driver);
			 L.setlogin("admin", "manager");
	 
	}

}
