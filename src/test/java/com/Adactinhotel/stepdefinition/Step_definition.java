package com.Adactinhotel.stepdefinition;



import org.openqa.selenium.WebDriver;


import com.Adactinhotel.BookaHotel;
import com.Adactinhotel.Bookeditinerary;
import com.Adactinhotel.Bookingconfirmation;
import com.Adactinhotel.Login;
import com.Adactinhotel.Searchhotel;
import com.Adactinhotel.Selecthotel;
import com.Adactinhotel.runner.Test_Runner;
import com.adactin.Helper.File_Reader_Manager;
import com.adactin.Helper.Page_Object_Manager;
import com.baseclass.Baseclass;
import com.baseclass.Baseclass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Step_definition extends Baseclass {

	
	public static WebDriver driver = Test_Runner.driver;
	
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	

public static Login log = new Login(driver);
public static Searchhotel sc = new Searchhotel(driver);
public static Selecthotel sh = new Selecthotel(driver);	
public static BookaHotel bh = new BookaHotel(driver);
public static Bookingconfirmation bc = new Bookingconfirmation(driver);
public static Bookeditinerary bi = new Bookeditinerary(driver);

	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		getUrl(url);
		
	    //getUrl("http://adactinhotelapp.com/");
	}

	//@When("^User Enter The Username In Usernamefield$")
	//public void user_Enter_The_Username_In_Usernamefield() throws Throwable {
	   //sendValues(log.getUname(), "sarandev88");
	 //  sendValues(pom.get_InstanceLogin().getUname(), "sarandev88");
	//}
	//Multiple data
	
	@When("^User Enter The \"([^\"]*)\" In Usernamefield$")
	public void user_Enter_The_In_Usernamefield(String Username) throws Throwable {
		sendValues(pom.get_InstanceLogin().getUname(), Username);
	   
	}
	
	@When("^User Enter The \"([^\"]*)\" In Passwordfield$")
	public void user_Enter_The_In_Passwordfield(String Password) throws Throwable {
	 sendValues(pom.get_InstanceLogin().getPass(), Password ); 
	}

	
	
	//single data 
	
	
	//@When("^User Enter The \"([^\"]*)\" In Usernamefield$")
	//public void user_Enter_The_In_Usernamefield(String Username) throws Throwable {
	//  sendValues(pom.get_InstanceLogin().getUname(), Username); 
	//}

	

	//@When("^User Enter The \"([^\"]*)\" In Passwordfield$")
	//public void user_Enter_The_In_Passwordfield(String Password) throws Throwable {
	//sendValues(pom.get_InstanceLogin().getPass(), Password); 
	//}


//pom project object manager
	
	
	//@When("^User Enter The Password In Passwordfield$")
	//public void user_Enter_The_Password_In_Passwordfield() throws Throwable {
	   // sendValues(log.getPass(), "sairam12$");
		//sendValues(pom.get_InstanceLogin().getPass(), "sairam12$");
	//}

	@Then("^User Click On The Login Button And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() throws Throwable {
	   //clickOnElement(log.getLogin());
		clickOnElement(pom.get_InstanceLogin().getLogin());
	}

	@When("^User Selects Location$")
	public void user_Selects_Location() throws Throwable {
	   //DropDown(sc.getLocation(),"Sydney");
	   DropDown(pom.get_Instance_Search().getLocation(),"Sydney");
	}

	@When("^User Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {
		//DropDown(sc.getHotel(), "Hotel Creek");
		DropDown(pom.get_Instance_Search().getHotel(), "Hotel Creek");
	    
	}

	@When("^User Selects Roomtype$")
	public void user_Selects_Roomtype() throws Throwable {
		//DropDown(sc.getType(), "Double");
		DropDown(pom.get_Instance_Search().getType(), "Double");
	    
	}

	@When("^User Selects Required Number Of Rooms$")
	public void user_Selects_Required_Number_Of_Rooms() throws Throwable {
		//DropDown(sc.getRoomno(), "3");
		DropDown(pom.get_Instance_Search().getRoomno(), "3");
	    
	}

	@When("^User Selects Adults In Room field$")
	public void user_Selects_Adults_In_Room_field() throws Throwable {
	    //DropDown(sc.getAdultroom(), "3");
	    DropDown(sc.getAdultroom(), "3");
	}

	@When("^User Selects Children In Room Field$")
	public void user_Selects_Children_In_Room_Field() throws Throwable {
		//DropDown(sc.getChildroom(), "2");
		DropDown(sc.getChildroom(), "2");
	    
	}

	@Then("^User Click Search Button  And It Navigates To The  Select Hotel$")
	public void user_Click_Search_Button_And_It_Navigates_To_The_Select_Hotel() throws Throwable {
	    
		//clickOnElement(sc.getSearch());
		clickOnElement(pom.get_Instance_Search().getSearch());
	}

	@When("^User Chooses Hotel From The Radio Button$")
	public void user_Chooses_Hotel_From_The_Radio_Button() throws Throwable {
		//clickOnElement(sh.getRadiobutton());
		clickOnElement(pom.Get_Instance_Select().getRadiobutton());
	    
	}

	@Then("^User Clicks On Continue Button And It Navigates To The Book A Hotel$")
	public void user_Clicks_On_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		clickOnElement(pom.Get_Instance_Select().getClick());
	    
	}

	@When("^User Enter Their First Name$")
	public void user_Enter_Their_First_Name() throws Throwable {
		//sendValues(bh.getFname(), "Saranya");
		sendValues(pom.get_Instance_Book().getFname(), "Saranya");
	    
	}

	@When("^User Enters Their Last Name$")
	public void user_Enters_Their_Last_Name() throws Throwable {
		//sendValues(bh.getLname(), "dev");
		sendValues(pom.get_Instance_Book().getLname(), "dev");
	}

	@When("^User Enters Billing Address$")
	public void user_Enters_Billing_Address() throws Throwable {
		//sendValues(bh.getAddress(), "No 4 forex lane, south east street, washington- 568931 ");
		sendValues(pom.get_Instance_Book().getAddress(), "No 4 forex lane, south east street, washington- 568931 ");
	}

	@When("^User Enters  Credit Card Number$")
	public void user_Enters_Credit_Card_Number() throws Throwable {
		//sendValues(bh.getCnum(), "1569847234126786");
		String cardNo = File_Reader_Manager.getInstance().getInstanceCR().cardNo();
		//sendValues(bh.getCnum(), cardNo);
		sendValues(pom.get_Instance_Book().getCnum(), cardNo);
		 
		
	}

	@When("^User Enters Credit Card Type$")
	public void user_Enters_Credit_Card_Type() throws Throwable {
		//DropDown(bh.getCtype(), "VISA");
		DropDown(pom.get_Instance_Book().getCtype(), "VISA");

	    
	}

	@When("^User Chooses Credit Card Expiry Month$")
	public void user_Chooses_Credit_Card_Expiry_Month() throws Throwable {
		
		//DropDown(bh.getEmonth(), "5");
		DropDown(pom.get_Instance_Book().getEmonth(), "5");
	}
	
	@When("^User Chooses Credit Card Expiry Year$")
	public void user_Chooses_Credit_Card_Expiry_Year() throws Throwable {
		//DropDown(bh.getEyear(), "2013");
		DropDown(pom.get_Instance_Book().getEyear(), "2013");
	}	
	
	    
	

	@When("^User Chooses Cvv Number$")
	public void user_Chooses_Cvv_Number() throws Throwable {
		//sendValues(bh.getCvv(), "752");
		String cvvNum = File_Reader_Manager.getInstance().getInstanceCR().cvvNum();
		sendValues(pom.get_Instance_Book().getCvv(), cvvNum);
	    
	}

	@Then("^User Clicks Booknow Button And It Navigates To The  Booking Confirmation$")
	public void user_Clicks_Booknow_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
	   //clickOnElement(bh.getBook()); 
	   clickOnElement(pom.get_Instance_Book().getBook()); 
	  Thread.sleep(5000);
	}
	

	
	@Then("^User Clicks Booked Itinerary$")
	public void user_Clicks_Booked_Itinerary() throws Throwable {
	
		//clickOnElement(bc.getItinerary());
		clickOnElement(pom.get_Instance_Confirm().getItinerary());
	}
	
	    
		
@When("^Click Order Id Checkbox$")
	public void click_Order_Id_Checkbox() throws Throwable {
		
//clickOnElement(bi.getCheckall());
clickOnElement(pom.get_Instance_itinerary().getCheckall());
	    
	}

	@Then("^User Clicks Logout Button$")
	public void user_Clicks_Logout_Button() throws Throwable {

	//clickOnElement(bi.getLogout());
	clickOnElement(pom.get_Instance_itinerary().getLogout());
	}
	}
	    
	







	
	
	




