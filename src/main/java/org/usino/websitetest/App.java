package org.usino.websitetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by mingjingtang on 8/3/17.
 */
public class App {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/mingjingtang/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.usino.org");

		List<WebElement> bottemIcons = driver.findElements(By.xpath("//div[contains(@class,'homeitemcount')]"));
		for(WebElement element: bottemIcons){
			String elementLinkText = element.getText();
			WebElement elementWithLink = driver.findElement(By.xpath("//a[contains(@title, '" + elementLinkText + "')]"));
			String link = elementWithLink.getAttribute("href");
			System.out.println(link);
		}
		driver.quit();
	}
}
