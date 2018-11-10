package day20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SwitchingWindows {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open 1st window
		driver.get("https://www.hdfcbank.com/");
		
		//open 2nd window
		driver.findElement(By.id("loginsubmit")).click();
		
		//create an arrayList of WindowHandles
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("35426789");
		
		
		
		
	}

}
