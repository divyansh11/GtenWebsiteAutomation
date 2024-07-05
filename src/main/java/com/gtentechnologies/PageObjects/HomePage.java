package com.gtentechnologies.PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	
	@FindBy(css=".py-3.achievement-section.row")
	protected WebElement scr;
	
	@FindBy(xpath="//*[@class='d-none d-md-block']")
	protected WebElement ser;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/div[3]/div/div/div[2]/ol/li")
	protected List<WebElement> servalue;
	
	@FindBy(xpath="//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div/div/div[1]/p")
	protected WebElement aboutusdesc;
	
	
	@FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/a[6]/span")
	protected WebElement contactusnav;
	
	
	
	
	
	
	
	public String home() {
		return getElementText(Homename);
		
	}
	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public String title() {
		return gettitle(driver);
	}
	
	public String servtext() throws InterruptedException {
		scroll(scr);
		return getElementText(ser);
	}
	
	public  List<String> getservvalue() {
		return getListofTextFromWebElements(servalue);
		
	}
	
	public String aboutUsServ() {
		return getElementText(aboutusdesc);
	}
	
	public void navigatetocontactus() {
		clickElement(contactusnav);
	
	}



}


