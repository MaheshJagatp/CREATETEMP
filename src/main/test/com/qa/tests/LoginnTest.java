package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

#new  commit for create pull request
public class LoginnTest extends TestBase {
	LoginPage lp;
	
	public LoginnTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		lp=new LoginPage();

	}
	
	@Test(priority = 1)
	public void loginPageTest() {
		lp.logIn(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
