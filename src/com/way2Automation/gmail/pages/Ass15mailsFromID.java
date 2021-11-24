package com.way2Automation.gmail.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2Automation.gmail.properies.configuration;

public class Ass15mailsFromID {
	WebDriver driver;

	public Ass15mailsFromID(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "//*[@id=\"gs_lc50\"]/input[1]")
	public WebElement searchbox1;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]")
	public WebElement EmailName;
	
	
	
	public Ass16Attachments enterMailId(String Email) throws InterruptedException
	{
		
		Thread.sleep(2000);
		searchbox1.clear();
		searchbox1.sendKeys(Email);
		searchbox1.sendKeys(Keys.ENTER);
		boolean b=EmailName.isDisplayed();
		System.out.println("Mails from given email Id are displaying after search:"+b);
		return PageFactory.initElements(driver, Ass16Attachments.class);
	}
	

}
