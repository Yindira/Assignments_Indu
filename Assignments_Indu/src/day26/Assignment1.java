package day26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
	}
	
	@Test
	
	public void autoComplete() {
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("India");
		
		WebElement source = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.click(source).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	@AfterTest
	
	public void closeBrowser() {
		
		driver.close();
	}

}

//Correct
