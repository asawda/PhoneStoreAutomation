package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
import com.qa.pages.BasePage;

public class HomePage extends BasePage {


	private final static By linkSignIn = By.xpath("//a[contains(@href,'login')]");

	
	// This method decides whether to shop moisturizer or Sunscreen based on the current temperature and then clicks on the appropriate button
	public static void clickOnSignIn() {
	click(linkSignIn,WaitStrategy.CLICKABLE);
	}
}
