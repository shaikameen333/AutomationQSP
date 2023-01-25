package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoB {
 static {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\Ameen Shaik\\eclipse-workspace\\Automation\\driver\\geckodriver.exe");
 }
	 public static void main (String[]args) {
	 WebDriver driver=new ChromeDriver();
	 demoA.testA(driver);
	 WebDriver driver1=new FirefoxDriver();
	 demoA.testA(driver1);
 }
}
