package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	
	public HomePage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	
	public WebElement getSignInLink() {
		return signInLink;
	}


	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement signInLink;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement emailTextBox;
	
	@FindBy(id = "continue")
	private WebElement continue_button;
	
	public WebElement getContinue_button() {
		return continue_button;
	}


	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement passwordTextBox;
	
	@FindBy(id = "signInSubmit")
	private WebElement signInButton;

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}


	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	
}
