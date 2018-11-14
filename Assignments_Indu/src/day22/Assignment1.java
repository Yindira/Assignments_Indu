package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment1 {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) {

		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");

	}

	@Test

	public void signInBtn() {

		boolean signBtn = driver.findElement(By.id("login-submit")).isEnabled();

		Assert.assertFalse(signBtn);

	}

	@AfterTest

	public void closeBrowser() {
		driver.close();
	}

}


//Correct.
