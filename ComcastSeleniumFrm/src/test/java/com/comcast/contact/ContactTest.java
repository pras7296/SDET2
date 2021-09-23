package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups = "Smoke")
	public void CreateContactTest(){
		
		System.out.println("execute create contact");
		String BROWSER= System.getProperty("browser");
		String ENV =System.getProperty("url");
		System.out.println("browser"     + BROWSER +",  url"+ ENV);
	}
	
	@Test(groups = "Smoke")
	public void CreateContactWithOrgTest(){
		System.out.println("Execute CreateContactWithOrg");
	}
	
	@Test(groups = "Regression")
	public void DeleteContactTest() {
		System.out.println("execute Delete contact");
	}
	
	@Test(groups = "Regression")
	public void DeleteContactwithorgTest() {
		System.out.println("execute Delete contact with org");
	}

}
