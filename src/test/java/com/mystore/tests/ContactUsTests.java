package com.mystore.tests;

import org.testng.annotations.Test;

import com.mystore.pages.HomePage;

public class ContactUsTests extends BaseTests{
	
		@Test
		public void testContactUsButton() {
			HomePage homePage = new HomePage(driver);
			homePage.goToHomePage()
			.goToContactUsPage();
			
		}
	
}
