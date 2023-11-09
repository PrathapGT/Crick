package Genericutilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * This class consists of basic  configuration annotations of testng
 * @author home
 *
 */
public class Baseclass {

	@BeforeSuite
	
	public void bsconfig() {
		
		System.out.println("Database connections successful");
	}
	
	@BeforeClass
		
	public void bclconfig() {
		
	}
	
	@BeforeMethod
	
	public void bmconfig() {
		
	}
	
	@AfterMethod
	
	public void amconfig() {
		
	}
	
	@AfterClass
	
	public void aclconfig() {
		
		
	}
	
	@AfterSuite
	
	public void asconfig() {
		
		
	}
	
	
	
	
	
	
	
	
	
}
