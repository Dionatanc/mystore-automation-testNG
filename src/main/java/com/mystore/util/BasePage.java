package com.mystore.util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends EmailGenerator {
	
	public WebDriver driver;
	
			//Constructor
			public BasePage(WebDriver driver) {
			this.driver = driver;
			}
			
			//Click method
			public void click (By elementBy) {
				driver.findElement(elementBy).click();
			}
			
			//Submit method 
			public void submit(By elementBy) {
				driver.findElement(elementBy).submit();
				
			}
			
			//Write Text
			public void writeText (By elementBy, String text) {
				driver.findElement(elementBy).sendKeys(text);
			
			}
			
			//Read Text
			public String  readText (By elementBy) {
				return driver.findElement(elementBy).getText();
				
			}

			//Assert
			public void assetEquals (By elementBy, String expectedText) {
				Assert.assertEquals(readText(elementBy), expectedText);
	}
	
}
