package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertwithok {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[.='Alert with OK & Cancel '] ")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
driver.switchTo().alert().dismiss();
boolean a = driver.findElement(By.xpath("//p[.='You Pressed Cancel']")).isDisplayed();
if(a==true)
	System.out.println("pass");
else
System.out.println("fail");
	}

}
