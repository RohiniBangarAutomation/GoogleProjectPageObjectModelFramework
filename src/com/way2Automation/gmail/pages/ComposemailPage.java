package com.way2Automation.gmail.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import java.lang.System.Logger;

//import java.util.logging.Logger;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.log4testng.Logger;

import com.way2Automation.gmail.properies.configuration;
//13.  To verify that "Compose" is working properly
public class ComposemailPage {
	WebDriver driver;
	Logger logger=Logger.getLogger(ComposemailPage.class);
	//PropertyConfigurator.configure("log4j.properties");

	public ComposemailPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = configuration.composeButton)
	public WebElement composeButton;

	@FindBy(xpath = configuration.dialogueBox)
	public WebElement dialogueBox;

	public mailSent composeMail() {
		composeButton.click();
		logger.info("clicked on compose button");
	
			boolean b = dialogueBox.isDisplayed();
			System.out.println("compose mail dialogueBox displyed:"+b);
			logger.info("compose mail dialogueBox displyed");
			return PageFactory.initElements(driver, mailSent.class);
		}
	}


