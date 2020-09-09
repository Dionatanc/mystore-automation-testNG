package com.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mystore.util.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	//*********Web Elements*********
		By usernameBy = By.name("email");
		By passwordBy = By.name("password");
		By loginButtonBy = By.id("submit-login");
		By createAccountButtonBy = By.partialLinkText("No account? Create one here");

		//*********Page Methods*********
		public LoginPage loginToHome (String username, String password) {
			//Enter Username(Email)
			writeText(usernameBy, username);
			//Enter Password
			writeText(passwordBy, password);
			//Click Login Button
			click(loginButtonBy);
			return this;
		}
		//Go to Create Account Page
		public AccountPage goToAccountPage() {
			click(createAccountButtonBy);
			return new AccountPage(driver);
			
		}

}
