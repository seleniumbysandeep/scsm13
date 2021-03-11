package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
    
	@Test(dependsOnMethods="modifycustomer")
	public void createcustomer() {
		Reporter.log("createcustomer",true);		
	}	
	@Test(dependsOnMethods="createcustomer")
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}
	
}