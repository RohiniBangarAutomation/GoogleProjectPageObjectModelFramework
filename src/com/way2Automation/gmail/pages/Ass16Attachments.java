package com.way2Automation.gmail.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ass16Attachments {
	WebDriver driver;

	public Ass16Attachments(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//*[@id=\"gs_lc50\"]/input[1]")
	public WebElement searchboxAttach;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/span")
	public WebElement checkAttachmentMails;
	
	@FindBy(xpath = "//div[@jsaction='kZCq9d:sqHGIc;']")
	public List<WebElement> checkAttachMailsinbox;
	
	public Ass17VerifySettingPage checkAttachments(String Attachment) throws InterruptedException
	{
		
		Thread.sleep(2000);
		searchboxAttach.clear();
		searchboxAttach.sendKeys(Attachment);
		searchboxAttach.sendKeys(Keys.ENTER);
		boolean b=checkAttachmentMails.isDisplayed();
		System.out.println("Mails who has attachments are displayed:"+b);
		int size=checkAttachMailsinbox.size();
		System.out.println("Mails with attachments in inbox are:"+size);
		return PageFactory.initElements(driver, Ass17VerifySettingPage.class);
	}

}
