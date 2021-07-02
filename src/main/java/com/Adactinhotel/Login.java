package com.Adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Uname;
	
	


	@FindBy(id="password")
	private WebElement pass;
	
	
	@FindBy(name="login")
	private WebElement login;
	
	
	public Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}


	

	public WebElement getUname() {
		return Uname;
	}
	

	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}


	
	
	
	

}
