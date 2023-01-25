package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.actitime.com/login.do");
      Loginpage l=new Loginpage(driver);
      l.setuser("admin1", "manager1");
      Thread.sleep(4000);
      l.setuser("admin", "manager");
      
	}

}
