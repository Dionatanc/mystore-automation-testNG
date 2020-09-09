package com.mystore.tests;

import org.testng.annotations.Test;

import com.mystore.pages.HomePage;

public class LoginTests extends BaseTests {

	
	@Test
	public void invalidLoginTest_InvalidName_InavlidPassword() {
		
		
        //*************PAGE INSTANTIATIONS*************
		HomePage homePage = new HomePage(driver);
		//*************PAGE METHODS********************
			homePage.goToHomePage()
			.goToLoginPage()
			.loginToHome("teste@teste.com.br", "12345");	
	}
	
}
