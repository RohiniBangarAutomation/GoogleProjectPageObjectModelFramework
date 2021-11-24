package com.way2Automation.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ass19Movelabel {
	WebDriver driver;
	public Ass19Movelabel(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[1]/div/div/div[3]")
	public WebElement clickLabel;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[2]")
	public WebElement moveLabel;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div[4]/div[1]/div[1]")
	public WebElement moveLabelto;
	
	@FindBy(xpath = "/html/body/div[29]/div/div[3]/div[1]/div")
	public WebElement labelfolder;
	
	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div/div[3]")
	public WebElement destLabel;
	
	
	public void clickLabel()
	{
		clickLabel.click();
	
	}
	public void moveLabel()
	{
		moveLabel.click();
	
	}
	public ASS20 moveLabelto()
	{
		moveLabelto.click();
		labelfolder.click();
		destLabel.click();
		System.out.println("Mails from source label to destination label moven successfully");
		return PageFactory.initElements(driver, ASS20.class);
	
	}
	
	

}
