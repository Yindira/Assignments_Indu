package day20;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open 1st window
		driver.get("https:/www.hdfcbank.com/");
		
		//open 2nd window
		driver.findElement(By.id("loginsubmit")).click();
		
		//create an arrayList of WindowHandles
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		
		System.out.println(driver.switchTo().window(windows.get(1)));
		
		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
		
		driver.switchTo().frame("login_page");
		
			
		driver.findElement(By.linkText("Know More")).click();
		
		/*String handle3 =driver.getWindowHandle();
		
		System.out.println(handle3);
		
		driver.switchTo().window(handle3);
		
		System.out.println(driver.switchTo().window(windows2.get(1)));
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[contains(@class,'manage_your_money applyWrap')]"))).build().perform();
		
		driver.findElement(By.linkText("Personal Loan")).click();
		
		driver.findElement(By.linkText("Visa CardPay")).click();
		*/
	}


}
