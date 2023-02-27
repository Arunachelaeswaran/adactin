package com_adactin_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_adactin_base.BaseClass;

public class BookHotelPage extends BaseClass {


	public BookHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hotel_name_dis")
	WebElement hotelname;
	
	@FindBy(id="hotel_name_dis")
	WebElement location;
	
	@FindBy(id="room_type_dis")
	WebElement room_type;
	
	@FindBy(id="room_num_dis")
	WebElement no_of_rooms;
	
	@FindBy(id="total_days_dis")
	WebElement total_days;
	
	@FindBy(id="price_night_dis")
	WebElement price_per_night;
	
	@FindBy(id="total_price_dis")
	WebElement total_price;
	
	@FindBy(id="gst_dis")
	WebElement gst;
	
	@FindBy(id="final_price_dis")
	WebElement final_price;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="last_name")
	WebElement lastname;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(name="cc_num")
	WebElement creditcard_no;

	@FindBy(name="cc_type")
	WebElement creditcard_type;
	
	@FindBy(name="cc_exp_month")
	WebElement selectmonth;
	
	@FindBy(name="cc_exp_year")
	WebElement selectyr;
	
	@FindBy(name="cc_cvv")
	WebElement cvv_no;
	
	@FindBy(name="book_now")
	WebElement book_btn;
	
	@FindBy(xpath ="//p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]")
	WebElement giventext ;
	
	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getTotal_days() {
		return total_days;
	}

	public WebElement getPrice_per_night() {
		return price_per_night;
	}

	public WebElement getTotal_price() {
		return total_price;
	}

	public WebElement getGst() {
		return gst;
	}

	public WebElement getFinal_price() {
		return final_price;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getbillAddress() {
		return address;
	}

	public WebElement getCreditcard_no() {
		return creditcard_no;
	}

	public WebElement getCreditcard_type() {
		return creditcard_type;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectyr() {
		return selectyr;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}
	
	public WebElement getbook_btn() {
		return book_btn;
	}
	
	public WebElement getgiventext() {
		return giventext;
	}
}
