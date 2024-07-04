package com.gtentechnologies.Utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	WebDriver driver;
	WebDriverWait wait;
	
    // For initialzing the driver
	public PageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public String gettitle(WebDriver driver) {
		return driver.getTitle();
	}
	// To check whether the elemnt is displayed or not
	public void waitUntilDisplayed(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
    // To check whether the element is clickable
	public void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	// To click an element
	public void clickElement(WebElement element) {
		waitUntilDisplayed(element);
		waitUntilClickable(element);
		element.click();

	}
	
	// To send the message in text box
	public void setTextBox(WebElement element, String value) {
		waitUntilDisplayed(element);
		waitUntilClickable(element);
		element.sendKeys(value);
	}
	
	// To get the text from a webelement
	public String getElementText(WebElement element) {
		waitUntilDisplayed(element);
		return element.getText();
	}

	// To accept any alert
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	// To display any alert
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		
	}
	
	// For handling child windows 
	public void switchChildWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		String parentWindow = windowHandles.iterator().next();
		String childWindow = windowHandles.iterator().next();
		driver.switchTo().window(childWindow);
	}
	
	// For handling parent windows 
	public void switchToParentWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		String parentWindow = windowHandles.iterator().next();
		String childWindow = windowHandles.iterator().next();
		driver.switchTo().window(parentWindow);

	}
	

	public List<String> getListofTextFromWebElements(List<WebElement> list) {
		List<String> actualList = new ArrayList<String>();
		for (WebElement item : list) {
			actualList.add(item.getText().toLowerCase());
		}
		return actualList;
	}
	
}
