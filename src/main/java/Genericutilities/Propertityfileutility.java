package Genericutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertityfileutility {

	public String readDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis	=new FileInputStream(".\\src\\test\\resources\\commondata.properties");	
				Properties pobj=new Properties();
				
		pobj.load(fis);	
		String value = pobj.getProperty(key);
		return value;		
				
				
			}
	
	
	
}
