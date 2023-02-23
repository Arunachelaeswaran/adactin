package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class TestScript extends BaseTest {

	@Test
	public static void script() throws InterruptedException {
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click the Login button
		driver.findElement(By.linkText("Log in")).click();
		
		//Enter the Username
		driver.findElement(By.name("email")).sendKeys("arunachelam21@gmail.com");
		
		//Enter the Password
		driver.findElement(By.name("password")).sendKeys("8525829938");
		
		//Click the Login button
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		
		//print the homepage text
		Thread.sleep(2000);
		WebElement text1 = driver.findElement(By.xpath("//h1[.=' LetCode with Koushik']"));
		String s = text1.getText();
		System.out.println("Homepage: "+s);
		
		//Goto the workspace
		driver.findElement(By.id("testing")).click();
		
		//print the name of workspace page
		Thread.sleep(2000);
		WebElement text2 = driver.findElement(By.xpath("//h1[.=' Practice and become pro in test automation']"));
		System.out.println("Workspace Page: "+text2.getText());
	
		
	}
	
	

}
