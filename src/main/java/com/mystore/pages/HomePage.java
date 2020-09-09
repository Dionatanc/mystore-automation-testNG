package com.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mystore.util.BasePage;

public class HomePage extends BasePage{
		public HomePage (WebDriver driver) {
			super(driver);		
		}
		
		//*********Page Variables*********
		String baseURL = "https://marcelodebittencourt.com/demoprestashop/";
		
		//*********Web Elements*********
		By signInButton = By.className("material-icons");
		By contatcUsButton = By.partialLinkText("Contact us");
		
	    //*********Page Methods*********
	    //Go to Homepage
		public HomePage goToHomePage() {
			driver.get(baseURL);
			return this;
			
		}
		
		//Go to LoginPage
		public LoginPage goToLoginPage() {
			click(signInButton);
			return new LoginPage(driver);
		}
		
		//Go to ContactUs Page
		public ContactUsPage goToContactUsPage() {
			click(contatcUsButton);
			return new ContactUsPage(driver);
		}
		
}
