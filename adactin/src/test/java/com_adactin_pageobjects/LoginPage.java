package com_adactin_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com_adactin_base.BaseClass;

public class LoginPage extends BaseClass{

	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	public WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
