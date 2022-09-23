package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	
	public static WebDriver driver;
	
	public AddressPage(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[1]")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
	private WebElement textFullName;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	private WebElement textMobileNumber;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
	private WebElement textPostalCode;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
	private WebElement textFlat;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
	private WebElement textArea;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
	private WebElement textLandmark;
	
	@FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
	private WebElement textCity;
	
	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[2]")
	private WebElement selectState;
	
	@FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[3]")
	private WebElement addressType;
	
	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement addAddressButton;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getTextFullName() {
		return textFullName;
	}

	public WebElement getTextMobileNumber() {
		return textMobileNumber;
	}

	public WebElement getTextPostalCode() {
		return textPostalCode;
	}

	public WebElement getTextFlat() {
		return textFlat;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getTextLandmark() {
		return textLandmark;
	}

	public WebElement getTextCity() {
		return textCity;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getAddressType() {
		return addressType;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
	
	public void deliveryAddress() {
		
		addAddressButton.click();
		driver.close(); 
	}

}
