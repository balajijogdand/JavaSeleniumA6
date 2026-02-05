package org.automatioConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigrationAnnotations {
	@Test
	public void testCase1(){
		Reporter.log("This is a test case1 method",true);
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		Reporter.log("This is @BeforeMethod method",true);
	}
	
	@BeforeClass
	public void BeforeClass(){
		Reporter.log("This is @BeforeClass method", true);
	}
	
	@BeforeTest
	public void BeforeTest(){
		Reporter.log("This is @BeforeTest method",true);
	}
	
	@AfterTest
	public void AfterTest(){
		Reporter.log("This is @	@AfterTest method",true);
	}
	
	@AfterClass
	public void AfterClass(){
		Reporter.log("This is 	@AfterClass method",true);
	}
	
	@AfterMethod
	public void AfterMethod(){
		Reporter.log("This is @AfterMethod method",true);
	}
	
	@AfterTest
	public void AfterTest3(){
		Reporter.log("This is @AfterTest3 method",true);
	}
	
	@AfterSuite
	public void AfterSuite(){
		Reporter.log("This is @AfterSuite method",true);
	}
	
	@BeforeTest
	public void BeforeTest1(){
		Reporter.log("This is 	@BeforeTest1 method",true);
	}
	
	@BeforeMethod
	public void BeforeMethod1(){
		Reporter.log("This is @BeforeMethod1 method",true);
	}
	
	@BeforeClass
	public void BeforeClass1(){
		Reporter.log("This is @BeforeClass1 method", true);
	}
	
	@BeforeSuite
	public void BeforeSuite1(){
		Reporter.log("This is @BeforeSuite1 method", true);
	}
}
