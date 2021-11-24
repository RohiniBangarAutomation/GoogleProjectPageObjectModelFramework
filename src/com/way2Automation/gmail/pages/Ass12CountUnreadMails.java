package com.way2Automation.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.way2Automation.gmail.properies.configuration;
//12.  To verify and count unread emails in an INBOX
public class Ass12CountUnreadMails {
	WebDriver driver;
	

	public Ass12CountUnreadMails(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = configuration.signin)
	public WebElement signin;

	@FindBy(xpath = configuration.emailid)
	public WebElement emailid;

	@FindBy(xpath = configuration.next)
	public WebElement next;

	@FindBy(xpath = configuration.password)
	public WebElement password;

	@FindBy(xpath = configuration.passwordnext)
	public WebElement passwordnext;

	@FindBy(xpath = configuration.goToGmail)
	public WebElement goToGmail;
	

	public void signin() {
		signin.click();

	}

	public void login(String username) {

		emailid.sendKeys(username);
		

	}

	public void next() throws InterruptedException {
		next.click();
		Thread.sleep(3000);

	}

	public void loginpass(String mypassword) {

		password.sendKeys(mypassword);

	}

	public void passwordnext() throws InterruptedException {
		passwordnext.click();
		Thread.sleep(2000);

	}

	public gmailLandingPage goToGmail() throws InterruptedException {
		goToGmail.click();
		Thread.sleep(7000);
		return PageFactory.initElements(driver, gmailLandingPage.class);

	}

}
