package com.way2Automation.gmail.properies;

public class configuration {

	// config properties
	public static String testsite = "https://www.google.com/";

	// Xpath of all pages

	//Ass12CountUnreadMails
	
	public static final String signin="//a[text()='Sign in']";
	public static final String emailid="//input[@id='identifierId']";
	public static final String next="//span[text()='Next']";
	public static final String password="//input[@type='password']";
	public static final String passwordnext="//span[text()='Next']";
	public static final String  goToGmail="//a[text()='Gmail']";
	
	//gmail landingPage
	public static final String searchbox="//div[@id='gs_lc50']/input[@aria-label='Search mail']";
	public static final String TotalMails="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/span/div[3]";
	public static final String TotalMailcount="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/span/div[1]/span/span[2]";
	
	public static final String id="bangarrohini96@gmail.com";
	
	//countReadMails
	public static final String readSearchBox="//*[@id=\"gs_lc50\"]/input[1]";
	public static final String totalcount="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/span/div[1]/span/span[2]";
	
	//composemail
	public static final String composeButton="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div";
	public static final String dialogueBox="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea";

//send mail
	public static final String sendto="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea";
	public static final String sendtoCc="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/div/span/span/span[1]";
	public static final String sendtexttoCc="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[2]/td[2]/div/div/textarea";
	public static final String sendtoBCc="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]/span/span/span[2]";
	public static final String sendtexttoBCc="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[3]/td[2]/div/div/textarea";
	public static final String message="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div";
	public static final String send="/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]";
	public static final String ChecksentMail="/html/body/div[7]/div[3]/div/div[1]/div[3]/header/div[2]/div[2]/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/input[1]";
}
