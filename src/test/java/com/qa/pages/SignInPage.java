package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.driver.DriverManager;
import com.qa.enums.ConfigProperties;
import com.qa.enums.WaitStrategy;
import com.qa.pages.BasePage;
import com.qa.utils.PropertyUtils;

public class SignInPage extends BasePage {


	private final static By textBoxEmail = By.name("email");
	private final static By textBoxPassword = By.name("password");
	private final static By btnLogin = By.xpath("//button[@type='submit']");

	// This method decides whether to shop moisturizer or Sunscreen based on the current temperature and then clicks on the appropriate button
	public static void enterEmail() {
		sendKeys(textBoxEmail,PropertyUtils.get(ConfigProperties.EMAIL),WaitStrategy.VISIBLE);
	}

	public static void enterPassword() {
		sendKeys(textBoxPassword, PropertyUtils.get(ConfigProperties.PASSWORD) ,WaitStrategy.VISIBLE);
	}

	public static void clickOnLogin() {
		click(btnLogin,WaitStrategy.CLICKABLE);
	}

}
