package com.test.base;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class PageNavigationTest extends BaseTest{
	TabPage tabPage;
	
	
	@Test(priority=0)
	public void FirstTestLogintoBuyTab() {
		assertTrue(tabPage.selectedTab.getText().equals("Buy"));
		String selectValueLable =tabPage.selectSearchValueLable.getText();
		assertTrue(selectValueLable.equals("Buy"));
		String Title =getTitleContent(tabPage.domainHomeHeader);
		assertEquals(Title,"Find your perfect home", "Wrong title :"+Title);
	}
	
	@Test(priority=1)
	public void RentTest() {
		tabPage.RentLink.click();
		String currentUrl=driver.getCurrentUrl();
		assertEquals(currentUrl, "https://www.domain.com.au/?mode=rent", "Wrong page");
		String Title =getTitleContent(tabPage.domainHomeHeader);
		assertEquals(Title,"Find your perfect home", "Wrong title :"+Title);

	}
	@Test(priority=2)
	public void NewHomesTest() {
		tabPage.NewHomesLink.click();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("url:"+currentUrl);
		assertEquals(currentUrl, "https://www.domain.com.au/new-homes", "Wrong page"+currentUrl);
		String Title =getTitleContent(tabPage.newHomesTaglineTitle);
		assertEquals(Title, "Find New Homes", "Wrong title :"+Title);
		
	}
	@Test(priority=3)	
	public void solidTest() {
		tabPage.SoldLink.click();
		String currentUrl=driver.getCurrentUrl();
		assertEquals(currentUrl, "https://www.domain.com.au/?mode=sold", "Wrong page :"+currentUrl);
		String Title =getTitleContent(tabPage.domainHomeHeader);
		assertEquals(Title,"Find your perfect home", "Wrong title :"+Title);
	}
	
	@Test(priority=4)
	public void AgentsTest() {
		tabPage.AgentsLink.click();
		String currentUrl=driver.getCurrentUrl();
		assertEquals(currentUrl, "https://www.domain.com.au/real-estate-agents/", "Wrong page"+currentUrl);
		String searchTitle =getTitleContent(tabPage.agentsSearchTitle);
		assertEquals(searchTitle, "Find your local Real Estate Agent", "Wrong title :"+searchTitle);
	}

	@Test(priority=5)
	public void CommercialTest() {
		tabPage.CommercialLink.click();
		String currentUrl=driver.getCurrentUrl();
		assertEquals(currentUrl, "https://www.commercialrealestate.com.au/", "Wrong page"+currentUrl);
		String searchTitle =getTitleContent(tabPage.commercialsHomePageTagLine);
		assertEquals(searchTitle, "Australia's leading commercial property site", "Wrong title :"+searchTitle);
	}
	@BeforeClass
	public void beforeTest() {
		tabPage=new TabPage(driver);
		
	}
	@AfterTest
	public void afterMethod() {
		driver.close();
	}
	
	


}
