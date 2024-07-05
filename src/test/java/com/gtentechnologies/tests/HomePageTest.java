package com.gtentechnologies.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	
	@Test
	public void checkAllServicesAreDisplayed() {
		List<String> displayvalues=homepage.getservvalue();
		Collections.sort(displayvalues);
		List<String> actualvalues= List.of("digital product engineering", "product development", "low code intelligent automation", "sustenance & support", "innovation acceleration");
		Collections.sort(actualvalues);
		Assert.assertEquals(displayvalues, actualvalues);
	}
	
	@Test
	public void checkWhetherAboutusDescription() {
		String about=homepage.aboutUsServ();
		String actualabout="GTEN Technologies is a digital transformation consulting, technology services & solutions company. We help our clients achieve competitive advantage through End-to-End Digital Transformation and work across Financial Services, Digital Commerce, Healthcare and Product Engineering sectors. Our team brings together strong engineering and design capabilities with deep commitment to quality in building products to maximize business impact from emerging technologies.";
		Assert.assertEquals(about, actualabout);
	}
	

}
