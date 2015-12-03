package com.equinox.pages;

import org.openqa.selenium.WebDriver;

import com.equinox.utils.WebUtils;

public class BasePageObject extends WebUtils {

	public static WebDriver Driver;
	protected final WebDriver driver;

	public BasePageObject() {
		// TODO Auto-generated constructor stub
		this(Driver);
	}

	public BasePageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public void throwIFPageTitleDoesnotContain(String... titleFragments) {
		String actualTitle = driver.getTitle();

		for (String titleFragment : titleFragments) {

			if (!actualTitle.contains(titleFragment)) {
				throw new IllegalStateException(
						"incorrect page: expected to contain <" + titleFragment
								+ ">" + " but was: <" + actualTitle + ">");
			}
		}

	}

}
