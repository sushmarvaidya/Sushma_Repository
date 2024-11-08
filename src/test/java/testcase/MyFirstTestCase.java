package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestCase extends BaseTest {
	
	@Test(dataProvider="testdata")
	public static void LoginTest(String useremail,String pwd,String mobileno) throws InterruptedException
	{
		System.out.println("clicked successfully");
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(6));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("signin_button"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath(loc.getProperty("signup_link"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(useremail);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(pwd);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loc.getProperty("mobileno_field"))).sendKeys(mobileno);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loc.getProperty("checkbox_field"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loc.getProperty("signupfree_button"))).click();
	}

	@DataProvider(name="testdata")
	public Object[][] tData()
	{
	return new Object[][] {
		{"sushmarvaidya@gmail.com","1234","34567890"},
		{"sushma@gamil.com","5678","55555"},
		{"teting44","Rachi","45679"},
		{"sushmavaidya11","rtyuu","4567890"},
		{"sushmarvaidya5@gmail.com","Rachi@789","9900578103"}
	};

	}

}

