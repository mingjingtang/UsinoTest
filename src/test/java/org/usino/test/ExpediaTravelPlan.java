package org.usino.test;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpediaTravelPlan {
	@BeforeClass
	public static void setProperty(){
		System.setProperty("webdriver.gecko.driver", "/Users/mingjingtang/Downloads/geckodriver");
	}

	@Test
	public void searchHotel(){
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.expedia.com/");
		wd.findElement(By.xpath("//*[@id=\"package-origin-hp-package\"]")).sendKeys("New York");
		wd.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("Los Angeles");
		wd.findElement(By.id("package-departing-hp-package")).sendKeys("08/11/2017");
		wd.findElement(By.id("package-returning-hp-package")).sendKeys("08/21/2017");
		Select dropdownRoom = new Select(wd.findElement(By.xpath("//*[@id=\"package-rooms-hp-package\"]")));
		dropdownRoom.selectByIndex(0);
		Select dropdownPersons = new Select(wd.findElement(By.xpath("//*[@id=\"package-1-adults-hp-package\"]")));
		dropdownPersons.selectByIndex(1);
		wd.findElement(By.xpath("//*[@id=\"partialHotelBooking-hp-package\"]")).click();
		wd.findElement(By.id("search-button-hp-package")).submit();
		wd.quit();
	}
}
