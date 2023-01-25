package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printheightandweidth {
  static {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement emailtbx=driver.findElement(By.id("email"));
       int height=emailtbx.getSize().getHeight();
       int weidth=emailtbx.getSize().getWidth();
       System.out.println("height");
       System.out.println("weidth");
       driver.close();
	}

}
