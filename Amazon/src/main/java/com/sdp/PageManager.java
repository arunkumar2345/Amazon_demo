package com.sdp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.page.AddressPage;
import com.page.HomePage;
import com.page.SearchPage;

public class PageManager {
	
	public static WebDriver driver;
	
	public static HomePage home;
	public static SearchPage search;
	private AddressPage address;
	
	public PageManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public HomePage getInstanceOfHome() {
		
		home = new HomePage(driver);
		return home;

	}
	
	public SearchPage getInstanceOfSearch() {
		
		search = new SearchPage(driver);
		return search;
	}
	
	public AddressPage getInstanceOfAddress() {
		
		address = new AddressPage(driver);
		return address;

	}
	
	
}
