package com.NykaaHelper;

public class ConfigReader {
	
	ConfigProperty con = new ConfigProperty();
	
	public String getbrowser() {
		String property = con.getpropertyfile().getProperty("browsers");
	
		return property;
	}
	
	public String geturl() {
		String url = con.getpropertyfile().getProperty("url");
		return url; 
	}
	
	public String firstwindow() {

		String fwindow = con.getpropertyfile().getProperty("firstwindow");
		return fwindow;
	}
	
	private String secondwindow() {

		String swindow = con.getpropertyfile().getProperty("secondwindow");
		return swindow;
	}
	
	public String getdropdown() {
		String dropdown = con.getpropertyfile().getProperty("a");
		return dropdown;		
	}
	
}
