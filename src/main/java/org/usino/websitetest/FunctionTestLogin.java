package org.usino.websitetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mingjingtang on 8/7/17.
 */
public class FunctionTestLogin {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Users/mingjingtang/Downloads/chromedriver 2");

		WebDriver wd = new ChromeDriver();
		wd.get("https://login.microsoftonline.com/");
		wd.manage().window().maximize();
		WebElement userid_inputtext = (WebElement) wd.findElement(By.id("cred_userid_inputtext"));
		WebElement userpasswd_inputtext = (WebElement)wd.findElement(By.id("cred_password_inputtext"));
		userid_inputtext.sendKeys("abc@gmail.com");
		userpasswd_inputtext.sendKeys("1234567");
	}

}
