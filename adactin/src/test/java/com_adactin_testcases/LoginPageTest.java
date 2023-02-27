package com_adactin_testcases;

import org.testng.annotations.Test;

import com_adactin_base.BaseClass;
import com_adactin_pageobjects.LoginPage;

public class LoginPageTest extends BaseClass{

	@Test
	public static void logintest() {
		
		Launchbrowser("https://adactinhotelapp.com/"); 
		implicitwait();
		maximize();
		LoginPage lp = new LoginPage();
		inputtext(lp.getUser(), "arunachelam99");
		inputtext(lp.getPass(), "8525829938");
		clickbtn(lp.getLogin());
		
	}

}
