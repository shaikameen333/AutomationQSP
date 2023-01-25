package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class democsslocators
{
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Ameen%20Shaik/OneDrive/Desktop/demo.html");
	     driver.findElement(By.cssSelector("a[id='d1']")).click();
	     driver.navigate().back();
	     driver.findElement(By.cssSelector("a[name='n']")).click();
	     driver.navigate().back();
	     driver.findElement(By.cssSelector("a[class='c1']")).click();
	     driver.navigate().back();
	     driver.findElement(By.cssSelector("a[href='https://www.qspiders.com/']")).click();
	     driver.navigate().back();
	     driver.close();
	     
	}
}