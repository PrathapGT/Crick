package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfilePractice {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
		
		Properties pobj=new Properties();
		
		pobj.load(fis);
		
		String URL = pobj.getProperty("url");
		String BROWSER = pobj.getProperty("browser");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		System.out.println(URL);
		
	}

}
