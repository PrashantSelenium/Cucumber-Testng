package com.equinox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.equinox.utils.WebUtils;



public class LoginPage extends BasePageObject  {


	
	public static By Login_EMAIL =By.name("email");
	public static By Password = By.name("password");
	public static By LOGIN_BUTTON =By.cssSelector("input[type='submit']");
	public static By MEMBER_LOG_IN = By.cssSelector("a.in:not(.highlight)");

	public LoginPage() {
		// TODO Auto-generated constructor stub
		waitForElementPresent(LoginPage.MEMBER_LOG_IN, Integer.parseInt(getProperty("elementwait")));
		driver.findElement(LoginPage.MEMBER_LOG_IN).click();
	}

}
