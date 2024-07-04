package com.gtentechnologies.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gtentechnologies.Utils.PageActions;

public class HomePage extends PageActions{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".active.nav-link")
	protected WebElement Homename;
	
	
	public String home() {
		return getElementText(Homename);
		
	}
	
	public String title() {
		return gettitle(driver);
	}



}


