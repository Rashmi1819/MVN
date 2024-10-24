package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
public void createCustomer() {
	Reporter.log("createCustomer",true);
	System.out.println(" hi ");
	}
	
	
@Test
public void updateCustomer() {
	Reporter.log("Updating the customer",true);
}
 @Test
 public void DeleteCustomer() {
	 Reporter.log("Deleting the customer",true);
	 
 }
}
