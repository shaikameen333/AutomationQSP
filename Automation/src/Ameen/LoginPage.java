package Ameen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
      @FindBy(id = "username")
      private WebElement utbx;
      @FindBy(name = "pwd")
      private WebElement pwd;
      @FindBy(linkText = "Login ")
      private WebElement login;
      public LoginPage(WebDriver driver) {
    	  PageFactory.initElements(driver, this);
      }
      public void setLogin(String us,String pwdt) {
    	 utbx.sendKeys(us);
    	 pwd.sendKeys(pwdt);
    	 login.click();
      }
}
