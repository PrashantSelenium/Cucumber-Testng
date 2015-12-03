package com.equinox.core;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;






import com.equinox.pages.BaseQa;
import com.equinox.pages.LoginPage;
import com.equinox.utils.WebUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebStepDef extends BaseQa  {

	@Given("^I open the browser$")
	public void I_open_the_browser() {
		getDefaultUserLoginPage();
		log.info("in OPen browser");
		PageFactory.initElements(driver, LoginPage.class);

	}

	@When("^I type username as (.*)$")
	public void I_type_username_as(String uname) {
		type(LoginPage.Login_EMAIL, uname);

	}

	@When("^I type password as (.*)$")
	public void I_type_password_as(String pwd) {
		 type(LoginPage.Password, "rohit@way2");
		type(LoginPage.Password, pwd);

	}

	@When("^I click at login button$")
	public void I_click_at_login_button() {
		click(LoginPage.LOGIN_BUTTON);

	}
	@Then("^Verify home page$")
	public void Verify_page(){
		Assert.assertTrue((driver.getTitle().contains("salesforce.com")), "Not able to Land Home Page");
	}



}
