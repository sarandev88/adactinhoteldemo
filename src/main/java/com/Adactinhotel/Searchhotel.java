package com.Adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement type;
	
	
	@FindBy(name="room_nos")
	private WebElement roomno;
	
	@FindBy(name="datepick_in")
	private WebElement checkin;
	
	@FindBy(name="datepick_out")
	private WebElement checkout;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
	
	

	public Searchhotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getLocation() {
		return location;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	


}
