package com.gtentechnologies.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.gtentechnologies.PageObjects.HomePage;

public class BaseTest {
	WebDriver driver=null;
	@BeforeMethod
	public void driverInitialize() {
		String browsername="Chrome";
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		initpages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.gtentechnologies.com/");
		
	}
	public HomePage homepage;
	
	public void initpages() {
		homepage=new HomePage(driver);
	}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
	

}
