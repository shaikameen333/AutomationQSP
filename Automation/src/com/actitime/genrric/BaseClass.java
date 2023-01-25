package com.actitime.genrric;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest
	public void openbrowser() {
		Reporter.log("open browser",true);
	}
	@AfterTest
	public void closebrowser() {
		Reporter.log("close browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterTest
	public void logout() {
		Reporter.log("logout",true);
	}

}
