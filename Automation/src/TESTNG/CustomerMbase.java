package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genrric.BaseActiTime;

@Listeners(com.actitime.genrric.Listeners.class)
public class CustomerMbase extends BaseActiTime {
	@Test
	public void createcustomer() throws InterruptedException {
		Reporter.log("create customer",true);
		Thread.sleep(4000);
		Assert.fail();
	}
	@Test
	public void deletecustomer() throws InterruptedException {
		Reporter.log("Delete customer",true);
		Thread.sleep(4000);
		Assert.fail();
	}

}
