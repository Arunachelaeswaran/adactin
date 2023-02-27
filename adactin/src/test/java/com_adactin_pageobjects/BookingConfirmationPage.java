package com_adactin_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_adactin_base.BaseClass;

public class BookingConfirmationPage extends BaseClass{

	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	WebElement orderno;
	
	@FindBy(name="logout")
	WebElement logout;
	
	@FindBy(xpath = "//td[contains(text(),'You have successfully logged out. ')]")
	WebElement lasttext;
	
	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLasttext() {
		return lasttext;
	}
}
