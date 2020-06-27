package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.config.Configuration;


public class LoginPage  extends TestBase{
	
	
	
	@FindBy(xpath = Configuration.userid)
	WebElement UserID;
	
	@FindBy(xpath = Configuration.password)
	WebElement Password;
	
	@FindBy(xpath = Configuration.loginbtn)
	WebElement LoginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	public boolean logIn(String username,String password) {
		UserID.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
	return true;
	}
	
	
	
	
}
