package com.equinox.pages;

import org.testng.annotations.AfterClass;
import com.equinox.utils.WebUtils;

public class BaseQa extends WebUtils{

	@AfterClass
	public void ReleaseSetup(){
		driver.quit();
		
	} 
	
	public void getDefaultUserLoginPage(){
		driver = Setup_Browser();
		new LoginPage();
	}
}
