package com.mystore.tests;



import org.testng.annotations.Test;

import com.mystore.pages.HomePage;

public class AccountTests extends BaseTests{
	@Test
	public void accountTests() {
		//*************PAGE INSTANTIATIONS*************
		
		HomePage homePage = new HomePage(driver);
		//*************PAGE METHODS********************
		homePage.goToHomePage()
		.goToLoginPage()
		.goToAccountPage()
		.createAnAccount("Dionatan", "Carvalho", getSaltString()+"@gmail.com", "123456", "12/15/1987");
	}
}
