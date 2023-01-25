package Ameen;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {
	@Test(priority = 1)
	public void createcustomer() {
		Reporter.log("create customer",true);
	}
	@Test(priority = 2)
	public void modifycustomer() {
		Reporter.log("modify customer",true);
	}
	@Test(priority = 3)
	public void deletecustomer() {
		Reporter.log("delete customer",true);
		Assert.fail();
	}

}