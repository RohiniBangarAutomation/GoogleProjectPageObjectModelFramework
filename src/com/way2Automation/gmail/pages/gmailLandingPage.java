package com.way2Automation.gmail.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2Automation.gmail.properies.configuration;

import net.bytebuddy.asm.Advice.Return;

public class gmailLandingPage {
	WebDriver driver;

	public gmailLandingPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = configuration.searchbox)
	public WebElement searchbox;

	@FindBy(xpath = configuration.TotalMails)
	public WebElement TotalMails;

	@FindBy(xpath = configuration.TotalMailcount)
	public WebElement TotalMailcount;

	public void clickSearchBox(String text) {
		searchbox.sendKeys(text);
		searchbox.sendKeys(Keys.ENTER);

	}

	public countReadMails clickNext() throws InterruptedException {
		TotalMails.click();
		Thread.sleep(2000);
		String count = TotalMailcount.getText();
		System.out.println("Total unread mails are:" + count);
		//String actualCount = "96";
		//Assert.assertEquals(actualCount, count);
		//System.out.println("Unread emails count " + count + " is as expected");
		return PageFactory.initElements(driver, countReadMails.class);
		
		
	}

}
