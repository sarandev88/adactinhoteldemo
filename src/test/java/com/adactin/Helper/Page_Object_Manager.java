package com.adactin.Helper;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactinhotel.BookaHotel;
import com.Adactinhotel.Bookeditinerary;
import com.Adactinhotel.Bookingconfirmation;
import com.Adactinhotel.Login;
import com.Adactinhotel.Searchhotel;
import com.Adactinhotel.Selecthotel;

public class Page_Object_Manager {
	
	
// public WebDriver driver;
	// keeping object as private its purpose
	//po manager--->>>> private classname objName
	//
	private Login loginpage;  // private classname objName
	private Searchhotel search;
	private Selecthotel select;
	private BookaHotel book;
	private Bookingconfirmation confirm;
	private Bookeditinerary itinerary;
	
	public static WebDriver driver;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}



	public Login get_InstanceLogin() {
    Login login = new Login(driver);
    return login;
	}
	

	
//	public Login get_Instance_Login() {
//		loginpage = new Login(driver);
//		return loginpage;
	//}
	
	
	
	public Searchhotel get_Instance_Search() {
     search = new Searchhotel(driver);
     return search;
	}
	
	public Selecthotel Get_Instance_Select() {
 select = new Selecthotel(driver);
 return select;
	}
	
	public BookaHotel get_Instance_Book() {
		book = new BookaHotel(driver);
		return book;

	}
	public Bookingconfirmation get_Instance_Confirm() {
		confirm = new Bookingconfirmation(driver);
		return confirm;

	}
	
	public Bookeditinerary get_Instance_itinerary() {
		itinerary = new Bookeditinerary(driver);
		return itinerary;

	}
	}
	


