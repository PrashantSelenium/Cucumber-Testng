package com.equinox.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.equinox.pages.BaseQa;
import com.equinox.pages.LoginPage;
import com.equinox.utils.WebUtils;


public class LoginTest extends BaseQa {

	@BeforeTest
	public void setup() {
		getDefaultUserLoginPage();
		PageFactory.initElements(driver, LoginPage.class);
		new WebUtils().waitForElementPresent(LoginPage.MEMBER_LOG_IN, Integer.parseInt(getProperty("elementwait")));
		driver.findElement(LoginPage.MEMBER_LOG_IN).click();
	}

	@Test
	public void test() {
		type(LoginPage.Login_EMAIL, getProperty("defaultUser"));
		type(LoginPage.Password, getProperty("defaultPassword"));
		click(LoginPage.LOGIN_BUTTON);
		sleep(3000);
		Assert.assertTrue((driver.getTitle().contains("salesforce.com")), "Not able to Land Home Page");
	}

}
