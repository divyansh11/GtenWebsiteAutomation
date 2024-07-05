package com.gtentechnologies.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expclass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gtentechnologies.com/");
		
		WebElement answer= driver.findElement(By.cssSelector(".py-3.achievement-section.row"));
		
		scroll(answer);
		Thread.sleep(2000);
		String value=driver.findElement(By.xpath("//*[@class='d-none d-md-block']")).getText();
		System.out.println(value);

	}
	
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	

}
