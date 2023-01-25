package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      boolean check = driver.findElement(By.id("keepMeLoggedInSection")).isSelected();
      if(check==true){
      System.out.println("checkbox is present"); 
      }
      else {
    	  System.out.println("checkbox is not present");
      }
      driver.close();
	}
}

