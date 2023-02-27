package com_adactin_testcases;

import org.testng.annotations.Test;

import com_adactin_base.BaseClass;
import com_adactin_pageobjects.BookHotelPage;
import com_adactin_pageobjects.BookingConfirmationPage;
import com_adactin_pageobjects.LoginPage;
import com_adactin_pageobjects.SearchHotelPage;
import com_adactin_pageobjects.SelectHotelPage;

public class BookingConfirmationPageTest extends BaseClass {

	@Test
	public static void bookingtest() {

		Launchbrowser("http://adactinhotelapp.com/");
		implicitwait();
		maximize();

		LoginPage lp = new LoginPage();
		inputtext(lp.getUser(), "arunachelam99");
		inputtext(lp.getPass(), "8525829938");
		clickbtn(lp.getLogin());

		SearchHotelPage sh = new SearchHotelPage();
		dropdown(sh.getLocation(), "Adelaide");
		dropdown(sh.getHotels(), "Hotel Cornice");
		dropdown(sh.getRoomtype(), "Deluxe");
		dropdown(sh.getNo_of_rooms(), "6");
		inputtext(sh.getDatein(), "25/02/2023");
		inputtext(sh.getDateout(), "01/023/2023");
		dropdown(sh.getNo_of_adults(), "2");
		dropdown(sh.getNo_of_childs(), "4");
		clickbtn(sh.getsubmit());

		SelectHotelPage slh = new SelectHotelPage();
		selectradio_btn(slh.getSelecthotel());
		clickbtn(slh.getContinue_btn());

		BookHotelPage bh = new BookHotelPage();
		get_attributetext(bh.getHotelname(), "value");
		get_attributetext(bh.getLocation(), "value");
		get_attributetext(bh.getRoom_type(), "value");
		get_attributetext(bh.getNo_of_rooms(), "value");
		get_attributetext(bh.getTotal_days(), "value");
		get_attributetext(bh.getPrice_per_night(), "value");
		get_attributetext(bh.getTotal_price(), "value");
		get_attributetext(bh.getGst(), "value");
		get_attributetext(bh.getFinal_price(), "value");
		inputtext(bh.getFirstname(), "Arunachelaeswaran");
		inputtext(bh.getLastname(), "Saravanakumar");
		inputtext(bh.getbillAddress(), "B4, Sastha Complex, GKM Street, Mouna Sammy Madam,Kumbakonam ");
		inputtext(bh.getCreditcard_no(), "1234567891234567"); // only allow numbers upto 16digits
		dropdown(bh.getCreditcard_type(), "MAST");
		dropdown(bh.getSelectmonth(), "12");
		dropdown(bh.getSelectyr(), "2022");
		inputtext(bh.getCvv_no(), "2127"); // its only allow numbers upto 4digits
		clickbtn(bh.getbook_btn());
		
		BookingConfirmationPage bc = new BookingConfirmationPage();
		get_attributetext(bc.getOrderno(), "value");
		clickbtn(bc.getLogout());
		get_attributetext(bc.getLasttext(), "value");
		screenshot();

	}

}
