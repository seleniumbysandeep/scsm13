package qsp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void createproject() {
		Reporter.log("createproject",true);
		
	}	
	@Test
	public void modifyproject() {
		Reporter.log("modifyproject",true);
	}
	@Test
	public void deleteproject() {
		Reporter.log("deleteproject",true);
	}
}
