package day24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2 {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void jsTest() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value= 'abc@gmail.com'");
		js.executeScript("document.getElementById('pass').value= 'password'");
		js.executeScript("document.getElementById('loginbutton').click()");
	}

	
}
//Excellent