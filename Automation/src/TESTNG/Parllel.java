package TESTNG;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Parllel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("enter the browser");
		Scanner sc= new Scanner(System.in);
		String browser = sc.nextLine();
		if(browser.equals("chrome")) {
		 driver=new ChromeDriver();
	}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}
}
