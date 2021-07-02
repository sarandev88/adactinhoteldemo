package com.Adactinhotel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel {
	public static WebDriver driver;
	
	//book a hotel
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement cnum;
	
	

	

	public WebElement getCnum() {
		return cnum;
	}

	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ctype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement emonth;

	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement  eyear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;
	
	

	public BookaHotel(WebDriver driver2) {
		this.driver =  driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getEmonth() {
		return emonth;
	}
	

	public WebElement getEyear() {
		return eyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	
	
	
	
	

}
