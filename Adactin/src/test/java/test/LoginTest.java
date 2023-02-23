package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
import base.BaseTest;
import utilities.ReadExcel;

public class LoginTest extends BaseTest{

	@Test(dataProviderClass = ReadExcel.class, dataProvider  = "logindata")
	public void logintest(String username,String password) throws IOException {

		//implicity
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//maximize the window
		driver.manage().window().maximize();

		//click the Goto Build 2
		driver.findElement(By.xpath(loc.getProperty("build2"))).click();

		//Get the Login Page Text
		//		WebElement txt1 = driver.findElement(By.xpath(loc.getProperty("txt1")));
		//		System.out.println(txt1.getText());

		WebElement txt2 = driver.findElement(By.xpath(loc.getProperty("txt2")));
		System.out.println(txt2.getText());

		//enter the username
		driver.findElement(By.id(loc.getProperty("name"))).sendKeys(username);

		//enter the password
		driver.findElement(By.id(loc.getProperty("pass"))).sendKeys(password);

		//click the login btn
		WebElement login_btn = driver.findElement(By.id(loc.getProperty("login_btn")));
		login_btn.click();
		
//		//particular element screenshot
//		File src_file = login_btn.getScreenshotAs(OutputType.FILE);
//		File scrs_dest = new File("./src\\test\\resources\\snaps/img.png");
//		FileHandler.copy(src_file, scrs_dest);
		
		//screenshot
		TakesScreenshot ss2 = (TakesScreenshot)driver;
		File scrs2 = ss2.getScreenshotAs(OutputType.FILE);
		File scrs_dest2 = new File("./src\\test\\resources\\snaps/img.png");
		FileHandler.copy(scrs2, scrs_dest2);
		
		
	
		//		//softassert for login text
		//		WebElement txt_assert = driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]//parent::div[@class='auth_error']"));
		//		String txt = txt_assert.getText();
		//		SoftAssert softAssert = new SoftAssert();
		//		softAssert.assertEquals(txt, "Invalid Login details or Your Password might have expired. ");



	}

}
