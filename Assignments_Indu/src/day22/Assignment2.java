package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {
	WebDriver driver;
	String expectedResult;
	String actualResult;

	@BeforeTest

	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@Test(priority=0)

	public void titleTest() {
		expectedResult = "Facebook - Log In or Sign Up";
		actualResult = driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(priority=1,enabled=false)
	public void logIn() {
		boolean loginBtn = driver.findElement(By.id("loginbutton")).isDisplayed();
		Assert.assertTrue(loginBtn);
	}

	@Test(priority=2)
	public void genderRadioBtn() {
		boolean radioBtn = driver.findElement(By.id("u_0_a")).isSelected();
		Assert.assertFalse(radioBtn);
	}

	@AfterTest

	public void closeBrowser() {
		driver.close();
	}
}
