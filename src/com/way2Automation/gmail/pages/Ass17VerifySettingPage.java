package com.way2Automation.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Ass17VerifySettingPage {
	
	WebDriver driver;
	public Ass17VerifySettingPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[2]/div[3]/div[3]/a")
	public WebElement settingsbutton;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div/button[2]")
	public WebElement Allsettingsbutton;
	//
	
	public Ass18Newlabel ClickSettings() throws InterruptedException
	{
		Thread.sleep(2000);
		settingsbutton.click();
		Thread.sleep(2000);
		Allsettingsbutton.click();
		boolean b=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[1]")).isDisplayed();
		//String expectedTitle="Settings";
	//	Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("settings page title displayed:"+b);
		driver.manage().window().maximize();
		return PageFactory.initElements(driver, Ass18Newlabel.class);
		
	}


}
