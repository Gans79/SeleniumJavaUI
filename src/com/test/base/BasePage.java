package com.test.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {
	WebDriver driver;
	
	 public BasePage(WebDriver driver)
	    {
	        this.driver= driver;

	        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 30),this);
	     
	    }

}
