package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadExcel;

public class BookHotel extends BaseTest {

	
	@Test(dataProviderClass = ReadExcel.class, dataProvider = "logindata")
	public void book(String username, String password) {
		//implicity
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//maximize the window
		driver.manage().window().maximize();

		//click the Goto Build 2
		driver.findElement(By.xpath(loc.getProperty("build2"))).click();

		//Get the Login Page Text
		//WebElement txt1 = driver.findElement(By.xpath(loc.getProperty("txt1")));
		//System.out.println(txt1.getText());

		WebElement txt2 = driver.findElement(By.xpath(loc.getProperty("txt2")));
		System.out.println(txt2.getText());

		//enter the username
		driver.findElement(By.id(loc.getProperty("name"))).sendKeys(username);

		//enter the password
		driver.findElement(By.id(loc.getProperty("pass"))).sendKeys(password);

		//click the login btn
		driver.findElement(By.id(loc.getProperty("login_btn"))).click();
		
		//select location
		WebElement location = driver.findElement(By.id("location"));
		Select sc_loc = new Select(location);
		sc_loc.selectByValue("Melbourne");
		
		//select Hotels
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select sc_htl = new Select(hotels);
		sc_htl.selectByValue("Hotel Cornice");
		
		//select RoomType
		WebElement room_ytpe = driver.findElement(By.id("room_type"));
		Select sc_Rtype = new Select(room_ytpe);
		sc_Rtype.selectByVisibleText("Super Deluxe");
		
		//select No of rooms
		WebElement n_rooms = driver.findElement(By.id("room_nos"));
		Select sc_n_rooms  = new Select(n_rooms);
		sc_n_rooms.selectByVisibleText("5 - Five");
		
		//select Check In Date
		WebElement In_date = driver.findElement(By.id("datepick_in"));
		In_date.sendKeys("19/02/2023");
		
		//select Check Out Date
		WebElement Out_date = driver.findElement(By.id("datepick_out"));
		Out_date.sendKeys("21/02/2023");
		
		
		//select Adults per Room
		WebElement per_adult = driver.findElement(By.id("adult_room"));
		Select sc_per_adult = new Select(per_adult);
		sc_per_adult.selectByValue("3");
		
		//select Children per Room
		WebElement per_child = driver.findElement(By.id("child_room"));
		Select sc_per_child = new Select(per_child);
		sc_per_child.selectByValue("3");

	}

}
