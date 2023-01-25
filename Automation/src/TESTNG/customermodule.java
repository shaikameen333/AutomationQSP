package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class customermodule {
     @Test(groups="regression test")
     public void createcustomer() {
    	 Reporter.log("create customer",true);
     }
     @Test(groups= {"smoke test","regression test"})
     public void modifycustomer() {
    	 Reporter.log("modify customer",true);
     }
     @Test(priority = 3)
     public void deletecustomer() {
    	 Reporter.log("delete customer",true);
     }
	
}
