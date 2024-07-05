package com.gtentechnologies.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	@Test
	public void checkWhetherHomeTitleIsCorrect() {
		
		String displayheading=homepage.home();
		String actualhead="Home";
		Assert.assertEquals(displayheading, actualhead);
		

	}
	
	@Test
	
	public void checkWhetherWebTitleIsCorrect() {
		String displaytitle=homepage.title();
		String actualtitle="Home | GTEN";
		Assert.assertEquals(displaytitle, actualtitle);
	}
	
	@Test
	public void checkWhetherServicesIsCorrect() throws InterruptedException {
		String displayser=homepage.servtext();
		String actualser="PRODUCT ENGINEERING";
		Assert.assertEquals(displayser, actualser);
	}

}
