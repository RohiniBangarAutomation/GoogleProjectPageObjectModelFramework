package com.way2Automation.gmail.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.way2Automation.gmail.properies.configuration;

public class ASS20 {
	WebDriver driver;

	public ASS20 (WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[3]/div[1]/div[2]/div/a")
	public WebElement acclogo;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[4]/div[4]/a")
	public WebElement signout;
	
	//
	public void click() throws InterruptedException {
		Thread.sleep(2000);
		acclogo.click();
		Thread.sleep(2000);
		signout.click();
		System.out.println("Signed out of Gmail Successfully");

	}

}
