package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabPage extends BasePage {

	public TabPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@class='desktop-nav__menu-option-link '][text()='Rent']")
	WebElement RentLink;
	@FindBy(xpath="//a[@class='desktop-nav__menu-option-link '][text()='New homes']")
	WebElement NewHomesLink;
	@FindBy(xpath="//a[@class='desktop-nav__menu-option-link '][text()='Sold']")
	WebElement SoldLink;
	@FindBy(xpath="//a[@class='desktop-nav__menu-option-link '][text()='Commercial']")
	WebElement CommercialLink;
	@FindBy(xpath="//a[@class='desktop-nav__menu-option-link '][text()='Agents']")
	WebElement AgentsLink;
	
	@FindBy(css=".desktop-nav__menu-option-link.is-selected")
	public WebElement selectedTab;
	
	@FindBy(css=".domain-home__header h2")
	public WebElement domainHomeHeader;

	@FindBy(css=".card.plain.invisible.new-homes-tagline h1")
	public WebElement newHomesTaglineTitle;
	
	@FindBy(css=".homepage-tag-line")
	public WebElement commercialsHomePageTagLine;
	
	@FindBy(css=".Select-value-label")
	public WebElement selectSearchValueLable;
	
	@FindBy(css=".find-an-agent__content-title")
	WebElement agentsSearchTitle;
	
	
}
