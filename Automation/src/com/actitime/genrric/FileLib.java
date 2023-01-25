package com.actitime.genrric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileLib {

	public void clickElement(WebElement wb)
	{
		wb.click();
	}

	public void SendkeysElement(WebElement wb,String s)
	{
		wb.sendKeys(s);
	}
	public WebElement XpathElement(WebDriver wbd,String s)
	{
		return wbd.findElement(By.xpath(s));
	}
	public WebElement IdElement(WebDriver wbd,String s)
	{
		return wbd.findElement(By.id(s));
	}
	public WebElement nameElement(WebDriver wbd,String s)
	{
		return wbd.findElement(By.name(s));
	}
}