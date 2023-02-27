package com_adactin_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_adactin_base.BaseClass;

public class SelectHotelPage extends BaseClass{

	public SelectHotelPage() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	public WebElement selecthotel;
	
	@FindBy(id="continue")
	public WebElement continue_btn;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}
	
	
}
