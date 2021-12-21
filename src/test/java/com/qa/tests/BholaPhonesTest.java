package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.enums.ConfigProperties;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;
import com.qa.utils.PropertyUtils;


public class BholaPhonesTest extends BaseTest{	

	@Parameters({"browser1"})
	@Test(description = "Validate user is able to do end to end shopping flow either for moisturizers or sunscreens based on the current temperature")
	public  void signInPositive(String browser) throws Exception {
		System.out.println("browser is "+browser);
		HomePage.clickOnSignIn();
		
		SignInPage.enterEmail();
		SignInPage.enterPassword();
		SignInPage.clickOnLogin();
	
		Thread.sleep(2000) ;
		Assert.assertEquals(DashboardPage.getUserNameText(), PropertyUtils.get(ConfigProperties.USERNAME));
}	
	
	@Parameters({"browser2"})
	@Test(description = "Validate user is able to do end to end shopping flow either for moisturizers or sunscreens based on the current temperature")
	public  void signInNegative(String browser) throws Exception {
		System.out.println("browser is "+browser);
		HomePage.clickOnSignIn();
		
		SignInPage.enterEmail();
		SignInPage.enterPassword();
		SignInPage.clickOnLogin();
	
		Thread.sleep(2000) ;
		Assert.assertTrue(false);
	}
}
