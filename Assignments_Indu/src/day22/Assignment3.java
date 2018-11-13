package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment3 {
	
	WebDriver driver;
	boolean searchBtn;

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
	}

	@Test(priority=1)
	public void method1() {
		searchBtn = driver.findElement(By.name("search")).isEnabled();
		Assert.assertFalse(searchBtn);
	}
	
	@Test(priority=2)
	public void method2() {
		driver.findElement(By.name("first")).sendKeys("Indu");
		 searchBtn = driver.findElement(By.name("search")).isEnabled();
		 Assert.assertTrue(searchBtn);
	}
	
	@Test(priority=0)
	public void method3() {
		boolean linkText = driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		Assert.assertTrue(linkText);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


}
