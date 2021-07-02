package com.Adactinhotel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconfirmation {
	
	public static WebDriver driver;
	
	//booking confirmation
	
	@FindBy(xpath="(//input[@class='reg_button'])[2]")
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
	}


	public Bookingconfirmation(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);
	}

	

}
