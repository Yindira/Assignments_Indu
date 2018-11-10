package day20;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("New Delhi, India)");
		driver.findElement(By.id("hp-widget__sTo")).clear();
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Mumbai, India");
		driver.findElement(By.id("hp-widget__depart")).click();

		WebElement comingMonth = driver.findElement(By.xpath("(//div[contains(@class,'last')])[1]"));

		List<WebElement> columns = comingMonth.findElements(By.tagName("td"));

		for (WebElement x : columns) {
			if (x.getText().equals("10")) {
				x.click();
				break;
			}
		}

		driver.findElement(By.id("searchBtn")).click();

		String airline = driver.findElement(By.cssSelector(
				"#content > div > div.container.ng-scope > div.row > div.main.col-lg-9.col-md-9.col-sm-12.col-xs-12 > div:nth-child(5) > div > div.top_first_part.clearfix > div.col-lg-2.col-md-2.col-sm-2.col-xs-2.logo_section.padR0 > span.block.append_bottom3.clearfix > span.pull-left.airline_info_detls > span.logo_name.append_bottomSpace6.hidden-xs.visible-stb.ng-binding.ng-scope"))
				.getText();
		String price = driver.findElement(By.cssSelector(
				"#content > div > div.container.ng-scope > div.row > div.main.col-lg-9.col-md-9.col-sm-12.col-xs-12 > div:nth-child(5) > div > div.top_first_part.clearfix > div.col-lg-2.col-md-2.col-sm-2.col-xs-4.text-right.price_sectn.make_relative.pad0 > p.price_info.RobotoRegular > span.num.ng-binding"))
				.getText();

		System.out.println(airline);
		System.out.println(price);
	}

}
