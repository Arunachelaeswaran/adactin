package com_adactin_testcases;

import org.testng.annotations.Test;

import com_adactin_base.BaseClass;
import com_adactin_pageobjects.LoginPage;
import com_adactin_pageobjects.SearchHotelPage;
import com_adactin_pageobjects.SelectHotelPage;

public class SelectHotelPageTest extends BaseClass {
	
	@Test
	public static void selecthoteltest() {
		
		Launchbrowser("https://adactinhotelapp.com/");
		implicitwait();
		maximize();

		LoginPage lp = new LoginPage();
		inputtext(lp.getUser(),"arunachelam99");
		inputtext(lp.getPass(),"8525829938");
		clickbtn(lp.getLogin());

		SearchHotelPage sh = new SearchHotelPage();
		dropdown(sh.getLocation(),"Adelaide");
		dropdown(sh.getHotels(),"Hotel Cornice");
		dropdown(sh.getRoomtype(),"Deluxe");
		dropdown(sh.getNo_of_rooms(),"6");
		inputtext(sh.getDatein(),"25/02/2023");
		inputtext(sh.getDateout(),"01/023/2023");
		dropdown(sh.getNo_of_adults(),"2");
		dropdown(sh.getNo_of_childs(),"4");
		clickbtn(sh.getsubmit());
		
		SelectHotelPage slh = new SelectHotelPage();
		selectradio_btn(slh.getSelecthotel());
		clickbtn(slh.getContinue_btn());
	}

}
