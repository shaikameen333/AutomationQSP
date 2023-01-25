package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open browser",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login ",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("create customer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("delete customer",true);

	}
}
