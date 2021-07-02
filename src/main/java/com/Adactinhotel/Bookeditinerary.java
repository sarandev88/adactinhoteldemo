package com.Adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookeditinerary {
	//booked itinerary
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkall;
	
	public WebElement getCheckall() {
		return checkall;
	}

	public WebElement getLogout() {
		return logout;
	}



	@FindBy(xpath="//input[@value='Logout']")
	private WebElement logout;
	
	

	public Bookeditinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	

	
	

}
