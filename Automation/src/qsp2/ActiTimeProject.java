package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.genrric.FileLib;

public class ActiTimeProject {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		FileLib fil=new FileLib();
		fil.IdElement(driver, "username").sendKeys("admin");
		fil.nameElement(driver, "pwd").sendKeys("manager");
		fil.XpathElement(driver,"//div[.='Login ']").click();

	}

}
