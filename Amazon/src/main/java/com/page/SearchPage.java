package com.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
		public static WebDriver driver;
		
		public SearchPage(WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "twotabsearchtextbox")
		private WebElement searchTextBox;
		
		@FindBy(xpath = "//input[@id='nav-search-submit-button']")
		private WebElement searchButton;
		
		@FindBy(xpath = "//img[@alt='Sponsored Ad - Apple iPhone 13 (256GB) - Midnight']")
		private WebElement selectMobile;
		
		@FindBy(xpath = "//input[@id='add-to-cart-button']")
		private WebElement addToCart;
		
		public WebElement getAddToCart() {
			return addToCart;
		}

		public WebElement getBuyNowButton() {
			return buyNowButton;
		}

		@FindBy(xpath = "//input[@id='buy-now-button']")
		private WebElement buyNowButton;
		
		@FindBy(xpath = "//input[@id='ap_password']")
		private WebElement passwordTextBox;
		
		@FindBy(id = "signInSubmit")
		private WebElement signInButton;


		public WebElement getSelectMobile() {
			return selectMobile;
		}

		public static WebDriver getDriver() {
			return driver;
		}

		public WebElement getSearchTextBox() {
			return searchTextBox;
		}

		public WebElement getSearchButton() {
			return searchButton;
		}
		
		public void searchProduct() {
			
			searchTextBox.sendKeys("iphone 13");
			searchButton.click();
			selectMobile.click();
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
				
				String newWindow = iterator.next();
				driver.switchTo().window(newWindow);
			}
			buyNowButton.click();
			passwordTextBox.sendKeys("test@123");
			signInButton.click();
			
		}



}
