package com.adactin.Helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager getInstance() {
File_Reader_Manager helper = new File_Reader_Manager();
return helper;
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;

	}
	//public Configuration_Reader getInstanceCr() throws Throwable {// call this method creating object
		
	//	Configuration_Reader reader = new Configuration_Reader();  //calling object 
		
	//	return reader; //return type gives Configuration_Reader
		
		
		

	}


