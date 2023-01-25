package qsp2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HidivinDivisionAssigement {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("dob")).click();
   WebElement month = driver.findElement(By.className("ui-datepicker-month"));
	Select s=new Select(month);
	s.selectByIndex(5);
	Thread.sleep(5000);
	
	
	WebElement year = driver.findElement(By.className("ui-datepicker-year"));
	Select y=new Select(year);
	y.selectByVisibleText("2000");
	Thread.sleep(5000);
	
	WebElement date = driver.findElement(By.className("ui-datepicker-calendar"));
	Select d=new Select(date);
	d.selectByValue("21");
	Thread.sleep(5000);
	
	driver.findElement(By.name("alternative_number")).sendKeys("984509450");
	driver.findElement(By.id("renew_policy_submit")).click();
	 
	  
     
    
      
      

	}

}
