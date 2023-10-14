package com.NykaaHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {

	FileInputStream fis;

	public Properties getpropertyfile() {

		File file = new File("E:\\Eclipse projects\\NykaaMaven\\src\\main\\java\\File.Properties");
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
		
	}

}
