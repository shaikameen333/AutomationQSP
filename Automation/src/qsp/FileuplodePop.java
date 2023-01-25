package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuplodePop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Ameen%20Shaik/OneDrive/Desktop/shaik%20ameen%20capg.pdf");
		Thread.sleep(5000);
		File f=new File("./shaikameen capg/resume.dox");
		String apath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(apath);
        Thread.sleep(5000);
        driver.close();
	}

}
