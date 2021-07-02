package com.adactin.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {

		File f = new File("D:\\saranya\\Adactinhotel\\src\\test\\java\\com\\adactin\\Property\\Configuration.properties");

FileInputStream fis = new FileInputStream(f);// taking file from data fileinputstream

 p = new Properties(); //object created to get load method

p.load(fis); // load ---> to add something in properties we use the method load.

	}
public String get_Browser() {
String browser = p.getProperty("browser");
return browser;
}

public String get_Url() {
	String url = p.getProperty("url");
	return url;
	
}
public String cardNo() {
	      String cardno = p.getProperty("cardno");
	return cardno;
}

//public String cardType() {
// String cardtype = p.getProperty("cardtype");
// return cardtype;
//}

public String cvvNum() {
String cvvno= p.getProperty("cvvno");
return cvvno;
}


}

