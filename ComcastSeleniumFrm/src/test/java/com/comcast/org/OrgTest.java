package com.comcast.org;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "Smoke")
	public void CreateOrgTest(){
		System.out.println("execute create org");
	}
	
	@Test(groups = "Regression")
	public void CreateOrgWithContactTest(){
		System.out.println("Execute CreateOrgWithContact");
	}
	
	@Test(groups = "Smoke")
	public void DeleteOrgTest() {
		System.out.println("execute Delete org");
	}

}
