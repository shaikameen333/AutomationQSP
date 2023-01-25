package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.genrric.BaseActiTime;

public class LoginActiTime extends BaseActiTime {

	@Test
	public void Ameen() {
		Reporter.log("login successfully done");
	}
}
