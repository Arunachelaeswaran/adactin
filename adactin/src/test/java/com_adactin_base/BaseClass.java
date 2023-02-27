package com_adactin_base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void Launchbrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void clickbtn(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}
	
	

	public static void inputtext(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void dropdown(WebElement element, String value) {
		Select sc = new Select(element);
		sc.selectByValue(value);
	}
	
	public static void selectradio_btn(WebElement element) {
		element.click();
	}
	
	public static void get_attributetext(WebElement element, String attribute) {
		String s = element.getAttribute(attribute);
		System.out.println(s);
	}
	
	public static void get_text(WebElement element) {
		String s = element.getText();
		System.out.println(s);
	}
	
	public static void waitforelement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void screenshot() {
		Date currentdate = new Date();
		String screeenshotfilename = currentdate.toString().replace(":", "-");
		File screeenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screeenshotFile,
					new File("./screenshots/screenshot" + screeenshotfilename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	

	@AfterClass
	public static void quit() {
		driver.quit();
	}
	
	

}
