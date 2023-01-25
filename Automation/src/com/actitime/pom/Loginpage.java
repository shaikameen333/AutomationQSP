package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	private WebElement untbx;
	private WebElement pwdtbx;
	private WebElement lptbx;
	public Loginpage(WebDriver driver){
		untbx=driver.findElement(By.id("username"));
		pwdtbx=driver.findElement(By.name("pwd"));
		lptbx=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setuser(String un,String pwd) {
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		lptbx.click();
	}
}
