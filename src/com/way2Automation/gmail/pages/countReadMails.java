package com.way2Automation.gmail.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Automation.gmail.properies.configuration;
//12.  To verify and count the read emails in an INBOX
public class countReadMails {
	WebDriver driver;

	public countReadMails(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath=configuration.readSearchBox)
	public WebElement readSearchBox;
	
	@FindBy(xpath=configuration.totalcount)
	public WebElement totalcount;
	
	public ComposemailPage countReadEmails(String ReadMails) throws InterruptedException
	{
		readSearchBox.clear();
		readSearchBox.sendKeys(ReadMails);
		readSearchBox.sendKeys(Keys.ENTER);
		//totalcount.click();
		Thread.sleep(3000);
		String readMailCount=totalcount.getText();
		System.out.println("Total read Emails are:"+readMailCount);
		return PageFactory.initElements(driver, ComposemailPage.class);
	}
	

}
