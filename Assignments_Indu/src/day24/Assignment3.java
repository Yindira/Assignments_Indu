package day24;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment3 {
	
	WebDriver driver;
	
	public static void verifyLinks(String url) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request);
		
		if(response.getStatusLine().getStatusCode() != 200) {
			
			System.out.println("Non Working link - "+ url);
		}
	}
	
@BeforeTest
	
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	
	public void allLinksCheck() throws ClientProtocolException, IOException {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement x:links) {
			
			String url = x.getAttribute("href");
			
			verifyLinks(url);
			
		}
		
		
	}

}
