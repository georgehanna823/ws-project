package com.sqa.gh.core;

import org.openqa.selenium.*;

import com.sqa.gh.helpers.*;

public class Core {

	private String baseUrl;

	protected WebDriver driver;

	private BasicTest curTest;

	public Core(BasicTest test) {
		super();
		this.baseUrl = test.getBaseUrl();
		this.driver = test.getDriver();
		this.curTest = test;
	}

	public Core(String baseUrl) {
		super();
		this.baseUrl = baseUrl;
	}

	public Core(String baseUrl, WebDriver driver) {
		super();
		this.baseUrl = baseUrl;
		this.driver = driver;
	}

	public String getBaseUrl() {
		return this.baseUrl;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public String getProp(String propName) {
		return AutoBasics.getProp(propName, "src/main/resources/", "config.properties", getLog());
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
