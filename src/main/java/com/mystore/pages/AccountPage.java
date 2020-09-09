package com.mystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mystore.util.BasePage;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	//*********Web Elements*********
		By genderBy = By.name("id_gender");
		By nameBy =  By.name("firstname");
		By lastNameBy = By.name("lastname");
		By emailBy = By.name("email");
		By passwordBy = By.name("password");
		By showPassword = By.className("btn");
		By birthdayBy = By.name("birthday");
		By offersCheck = By.name("optin");
		By newsletterCheckBy = By.name("newsletter");
		By termsCheckBy = By.name("psgdpr");
		By saveButtonBy = By.name("submitCreate");
		
		//*********Page Methods*********
		public AccountPage createAnAccount(String name, String lastName, String email, String password, String dateOfBirthday) {
			//Select your gender
			int a = driver.findElements(By.name("id_gender")).size();
			 for(int i=1;i<a;i++)
			 {
				 driver.findElements(By.name("id_gender")).get(1).click();
			 }
			
			//Enter your first name
			writeText(nameBy, name);
			//Enter your last name
			writeText(lastNameBy, lastName);
			//Enter your email
			writeText(emailBy, email);
			//Enter your password 
			writeText(passwordBy, password);
			//Click to show Password
			click(showPassword);
			//Enter your date of birthday
			writeText(birthdayBy, dateOfBirthday);
			//click to  Receive offers from our partners
			click(offersCheck);
			//click to Sign up for our newsletter
			click(newsletterCheckBy);
			//click to I agree to the terms and conditions and the privacy policy
			click(termsCheckBy);
			//click to save
			submit(saveButtonBy);
			return this;
		}
		
}
