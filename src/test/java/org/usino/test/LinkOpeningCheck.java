package org.usino.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class LinkOpeningCheck {
	@BeforeClass
	public static void setProperty(){
		System.setProperty("webdriver.gecko.driver", "/Users/mingjingtang/Downloads/geckodriver");
	}

	@Test
	public void linkOpeningCheck(){
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.usino.org");

		List<WebElement> bottomElement = wd.findElements(By.xpath("//div[contains(@class,'homeitemcount')]"));
		for(WebElement webElement: bottomElement){
			String title = webElement.getText();
			WebElement webElemntWithLink = wd.findElement(By.xpath("//a[contains(@title,'"+title+"')]"));
			System.out.println(webElemntWithLink.getAttribute("href"));
		}
		wd.quit();
	}
}
