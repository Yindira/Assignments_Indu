package day21;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Instagram")).click();
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		
		WebElement language = driver.findElement(By.cssSelector("#react-root > section > footer > div > nav > ul > li:nth-child(11) > span > select"));
		
		Select drpdown = new Select(language);
		drpdown.selectByVisibleText("Italiano");
		
		/*driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");*/
	}

}
