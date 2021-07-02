package com.Adactinhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	
	//select hotel
	


	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobutton;
	

	@FindBy(xpath="(//input[@class='reg_button'])[1]")
	private WebElement click;


	public static WebDriver driver;
	
	

	

	
	

	

	

	public Selecthotel(WebDriver driver2) {
this.driver = driver2;
PageFactory.initElements(driver2, this);

	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getClick() {
		return click;
	}

	

}
