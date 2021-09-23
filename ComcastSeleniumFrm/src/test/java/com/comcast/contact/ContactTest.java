package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "Smoke")
	public void CreateContactTest(){
		System.out.println("execute create contact");
	}
	
	@Test(groups = "Smoke")
	public void CreateContactWithOrgTest(){
		System.out.println("Execute CreateContactWithOrg");
	}
	
	@Test(groups = "Regression")
	public void DeleteContactTest() {
		System.out.println("execute Delete contact");
	}

}
