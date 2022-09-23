package com.run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.Base;
import com.page.HomePage;
import com.sdp.PageManager;

public class AmazonTest extends Base {
	
	public static WebDriver driver = Base.getBrowser("chrome");
	public static PageManager page = new PageManager(driver);
	@Test
	public void launch() {
		
		getURL("https://www.amazon.in/");
		maximize();
		
		click(page.getInstanceOfHome().getSignInLink());
		sendkeys(page.getInstanceOfHome().getEmailTextBox(), "arun.kumar8940@gmail.com");
	
		click( page.getInstanceOfHome().getContinue_button());
		click(page.getInstanceOfHome().getSignInButton());
		sendkeys(page.getInstanceOfSearch().getSearchTextBox(), "iphone 13");
		click(page.getInstanceOfSearch().getSearchButton());
		click(page.getInstanceOfSearch().getSelectMobile());
		click(page.getInstanceOfSearch().getBuyNowButton());
		page.getInstanceOfSearch().searchProduct();
		page.getInstanceOfAddress().deliveryAddress(); 
	}

}
