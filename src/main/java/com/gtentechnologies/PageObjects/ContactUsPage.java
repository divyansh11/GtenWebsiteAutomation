package com.gtentechnologies.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gtentechnologies.Utils.PageActions;

public class ContactUsPage extends PageActions{
	
	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#formBasicName")
	protected WebElement name;
	
	@FindBy(css="#formBasicPhone")
	protected WebElement phone;
	
	@FindBy(css="formBasicEmail")
	protected WebElement email;
	
	@FindBy(css="formBasicRequest")
	protected WebElement request;
	
	@FindBy(xpath="//*[@id=\"exampleForm.ControlTextarea1\"]")
	protected WebElement message;
	
	
	

}
