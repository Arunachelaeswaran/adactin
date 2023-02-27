package com_adactin_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_adactin_base.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	public WebElement location;

	@FindBy(id = "hotels")
	public WebElement hotels;

	@FindBy(id = "room_type")
	public WebElement roomtype;

	@FindBy(id = "room_nos")
	public WebElement no_of_rooms;

	@FindBy(id = "datepick_in")
	public WebElement datein;

	@FindBy(id = "datepick_out")
	public WebElement dateout;

	@FindBy(id = "adult_room")
	public WebElement no_of_adults;

	@FindBy(id = "child_room")
	public WebElement no_of_childs;

	@FindBy(id = "Submit")
	public WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getNo_of_adults() {
		return no_of_adults;
	}

	public WebElement getNo_of_childs() {
		return no_of_childs;
	}
	
	public WebElement getsubmit() {
		return submit;
	}

}
