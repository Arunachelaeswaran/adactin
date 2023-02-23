package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static FileReader fr1;
	public static Properties config = new Properties();

	public static FileReader fr2;
	public static Properties loc = new Properties();

	@BeforeMethod
	public static void setup() throws IOException {

		fr1 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
		config.load(fr1);

		fr2 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\locators.properties");
		loc.load(fr2);

		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser launced sucessfully");
			driver.get(config.getProperty("testurl"));
		}
		if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Browser launced sucessfully");
			driver.get(config.getProperty("testurl"));
		} 
		else if (config.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Browser launced sucessfully");
			driver.get(config.getProperty("testurl"));
		}

	}

	@AfterMethod
	public static void teardown() {
		
		System.out.println("Browser closed Successfully");
		driver.quit();

	}

}
