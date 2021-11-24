package com.way2Automation.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2Automation.gmail.properies.configuration;

public class mailSent {
	WebDriver driver;

	public mailSent(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = configuration.sendto)
	public WebElement sendto;

	@FindBy(xpath = configuration.sendtoCc)
	public WebElement sendtoCc;

	@FindBy(xpath = configuration.sendtexttoCc)
	public WebElement sendtexttoCc;

	@FindBy(xpath = configuration.sendtoBCc)
	public WebElement sendtoBCc;

	@FindBy(xpath = configuration.sendtexttoBCc)
	public WebElement sendtexttoBCc;

	@FindBy(xpath = configuration.message)
	public WebElement message;

	@FindBy(xpath = configuration.send)
	public WebElement send;

	@FindBy(xpath = configuration.ChecksentMail)
	public WebElement ChecksentMail;

	public void clickcc() throws InterruptedException {
		Thread.sleep(2000);
		sendtoCc.click();
	}

	public void SendmailToCc(String sendmailtoCc) throws InterruptedException {

		Thread.sleep(2000);
		sendtexttoCc.sendKeys(sendmailtoCc);
		Assert.assertEquals(sendmailtoCc, "mithunbangar@gmail.com");

		System.out.println("Send to Cc email id verified");

	}

	public void SendmailTo(String sendmailto) {
		sendto.sendKeys(sendmailto);
		Assert.assertEquals(sendmailto, "khairerohini1@gmail.com");
		System.out.println("Send to email id verified");
	}

	public void clickBcc() throws InterruptedException {
		Thread.sleep(2000);
		sendtoBCc.click();
	}

//
	public void SendmailToBcc(String sendmailtoBcc) {
		sendtexttoBCc.sendKeys(sendmailtoBcc);
		Assert.assertEquals(sendmailtoBcc, "bangarrohini96@gmail.com");
		System.out.println("Send to BCc email id verified");
	}

	public void Message(String mess) {
		message.sendKeys(mess);
	}

	public void MailSending() throws InterruptedException {
		Thread.sleep(2000);
		send.click();
	}

	public Ass15mailsFromID checksentmail(String sent) throws InterruptedException {
		// starred.sendKeys(Keys.PAGE_DOWN);
		ChecksentMail.clear();
		Thread.sleep(2000);
		ChecksentMail.sendKeys(sent);
		ChecksentMail.sendKeys(Keys.ENTER);
		System.out.println("Mail sent successfully verified");
		return PageFactory.initElements(driver, Ass15mailsFromID.class);

	}
}
