package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
	public static FileReader fr1;
	public static FileReader fr2;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		if(driver==null) {
			//System.out.println("The path is:" +System.getProperty("user.dir"));
			FileReader fr1=new FileReader(System.getProperty("user.dir")+"\\\\src\\\\test\\\\resources\\\\config.properties");
			FileReader fr2=new FileReader(System.getProperty("user.dir")+"\\\\src\\\\test\\\\resources\\\\locators.properties");
			prop.load(fr1);
			loc.load(fr2);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
			 driver.get(prop.getProperty("testurl"));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
			 driver.get(prop.getProperty("testurl"));
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		System.out.println("TearDown successfully");

	}
}
