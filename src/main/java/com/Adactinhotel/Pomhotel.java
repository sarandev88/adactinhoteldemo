package com.Adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomhotel {
	//register page
	public static WebDriver driver;
	
	@FindBy(linkText = "New User Register Here")
	private WebElement Reg;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement password;
	
	
	@FindBy(name="re_password")
	private WebElement confirmpassword;
	
	
	@FindBy(id="full_name")
	private WebElement fullname;
	
	
	@FindBy(id="email_add")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement register;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getReg() {
		return Reg;
	}
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
	public WebElement getFullname() {
		return fullname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getRegister() {
		return register;
	}
	
	
	

			
	
	
	
	

}
