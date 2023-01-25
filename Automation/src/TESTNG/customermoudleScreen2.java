package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genrric.BaseActiTime;
@Listeners(com.actitime.genrric.Listener2.class)
public class customermoudleScreen2 extends BaseActiTime {
	@Test
	public void customername() throws InterruptedException {
		Reporter.log("customernamecreated");
		Thread.sleep(5000);
		Assert.fail();
	}
}
