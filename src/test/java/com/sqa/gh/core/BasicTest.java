package com.sqa.gh.core;

import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

import com.sqa.gh.core.*;

public class BasicTest extends Core {

	public BasicTest(String baseUrl) {
		super(baseUrl);
	}
	// TODO Auto-generated constructor stub

	@BeforeClass
	public void setupDriver() {
		this.driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void setupTest() {
		getDriver().get(getBaseUrl());
	}

	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
}
