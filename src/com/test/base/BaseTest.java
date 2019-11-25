package com.test.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest  {

	public  WebDriver driver;
	String baseUrl;

	public WebDriverWait setWait(long timeToWait){
		return  new WebDriverWait(driver, timeToWait);
	}

	@BeforeTest
	public void before(ITestContext context) {

		String browsername = (String) context.getCurrentXmlTest().getParameter("browser");
		baseUrl =  	(String) context.getCurrentXmlTest().getParameter("baseUrl");
		switch (browsername) {

		case "Firefox": {
			System.setProperty("webdriver.gecko.driver", "/Users/rakeshprabhakaran/eclipse-workspace/ProgrammingBasics/src/Jars/geckodriver");
			DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			capabilities.setCapability("marionette", true);
			driver = new FirefoxDriver(capabilities);
			break;
		}


		case "Chrome": {
			System.setProperty("webdriver.chrome.driver", "/Users/rakeshprabhakaran/eclipse-workspace/DomainsTest/Jars/chromedriver");
			driver =  new ChromeDriver();
		}
		}

		driver.get(baseUrl);
		System.out.println("Opened : "+driver.getCurrentUrl());
		
	}
	
	public String getTitleContent(WebElement element) {
		return element.getAttribute("textContent");
	}

	


}
