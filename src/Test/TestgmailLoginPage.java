package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.way2Automation.gmail.pages.ASS20;
import com.way2Automation.gmail.pages.Ass12CountUnreadMails;
import com.way2Automation.gmail.pages.Ass15mailsFromID;
import com.way2Automation.gmail.pages.Ass16Attachments;
import com.way2Automation.gmail.pages.Ass17VerifySettingPage;
import com.way2Automation.gmail.pages.Ass18Newlabel;
import com.way2Automation.gmail.pages.Ass19Movelabel;
import com.way2Automation.gmail.pages.ComposemailPage;
import com.way2Automation.gmail.pages.countReadMails;
import com.way2Automation.gmail.pages.gmailLandingPage;
import com.way2Automation.gmail.pages.mailSent;
import com.way2Automation.gmail.properies.configuration;

public class TestgmailLoginPage {

	public static Properties object = new Properties();

	public static void main(String[] args) throws InterruptedException, IOException {

		// FileInputStream fis=new
		// FileInputStream("/Users/Mithun/Documents/AutomationClass/GooglePageObjectModelFramework/src/com/way2Automation/gmail/properies/object.properties");
		// object.load(fis);

		System.setProperty("webdriver.chrome.driver", "/Users/Rohini/Documents/chromedriver");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Logger logger = Logger.getLogger("TestgmailLoginPage");

		PropertyConfigurator.configure("log4j.properties");
		logger.info("generating extent report");
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReport/learnAutomation.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest log = extent.createTest("verify unread mail");
		log.log(Status.INFO, "verify unread mail");
		log.log(Status.PASS, "All unread mails are verified");
		log.pass("unread mails are verified", MediaEntityBuilder
				.createScreenCaptureFromPath("/Users/Rohini/Documents/ExtentScreenshot.png").build());
		extent.flush();
		
		logger.info("loading url");
		driver.get(configuration.testsite);
		Ass12CountUnreadMails count = PageFactory.initElements(driver, Ass12CountUnreadMails.class);
		count.signin();
		count.login(configuration.id);
		count.next();
		count.loginpass("Mithun@2");
		count.passwordnext();
		logger.info("displaying Landing page of gmail");
		gmailLandingPage landingPage = count.goToGmail();
		landingPage.clickSearchBox("is:unread in:inbox");
		countReadMails readmails = landingPage.clickNext();
		ComposemailPage compose = readmails.countReadEmails("is:read in:inbox");
		mailSent mailSEND=compose.composeMail();
		mailSEND.clickcc();
		
		mailSEND.SendmailToCc("mith@gmail.com");
		mailSEND.SendmailTo("khairero@gmail.com");
		mailSEND.clickBcc();
		mailSEND.SendmailToBcc("bangarrohini96@gmail.com");
		mailSEND.Message("Hi I am sending this mail");
		mailSEND.MailSending();
		Ass15mailsFromID mails=mailSEND.checksentmail("in:sent");
		Ass16Attachments checkattach=mails.enterMailId("mithunbangar@gmail.com");
		Ass17VerifySettingPage setting=checkattach.checkAttachments("has:attachment");
		Ass18Newlabel newlabel=setting.ClickSettings();
		newlabel.clickNewlabel();
		Ass19Movelabel movelabel=newlabel.labelname("testngSelenium");
		movelabel.clickLabel();
		logger.info("label moved from source to destination");
		movelabel.moveLabel();
		ASS20 signout=movelabel.moveLabelto();
		logger.info("Signing out of Gmail");
		signout.click();
	}

}
