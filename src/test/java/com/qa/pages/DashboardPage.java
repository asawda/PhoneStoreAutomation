package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
import com.qa.pages.BasePage;

public class DashboardPage extends BasePage {


	private final static By linkUserName = By.xpath("//li[@class='dropdown']/a");

	// This method decides whether to shop moisturizer or Sunscreen based on the current temperature and then clicks on the appropriate button
	public static String getUserNameText() {
		return getElementText(linkUserName).trim() ;
	}

}
