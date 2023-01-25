package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.drawingml.x2006.diagram.CTOtherwise;

public class SubmitClick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
  driver.findElement(By.name("btn_login")).submit();
 
  
	}

}
