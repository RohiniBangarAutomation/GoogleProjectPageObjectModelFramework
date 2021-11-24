package com.way2Automation.gmail.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ass18Newlabel {
	WebDriver driver;

	public Ass18Newlabel(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/span/span[1]")
	public WebElement More;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[5]/a")
	public WebElement Createlabel;

	@FindBy(xpath = "/html/body/div[39]/div[2]/input")
	public WebElement LabelName;

	@FindBy(xpath = "/html/body/div[39]/div[3]/button[1]")
	public WebElement LabelNext;

	@FindBy(xpath = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div/div[3]/span/a")
	public WebElement viewLabel;

	public void clickNewlabel() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", More);
		Thread.sleep(2000);
		More.click();
		Thread.sleep(2000);
//	    WebElement element=driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]"));
//	     Actions actions=new Actions(driver);
//	      actions.moveToElement(element).build().perform();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Createlabel);
		Thread.sleep(2000);
		Createlabel.click();

	}

	public Ass19Movelabel labelname(String labelname) throws InterruptedException {
		LabelName.sendKeys(labelname);
		LabelNext.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewLabel);
		Thread.sleep(2000);
		viewLabel.click();
		System.out.println("Label is created and dispalyed successfully");
		return PageFactory.initElements(driver, Ass19Movelabel.class);

	}

}
