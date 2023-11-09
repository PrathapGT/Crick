package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthc = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		String yearc = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(monthc.equals("January")) && yearc.equals("2024")) {
			
			driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			
			 monthc = driver.findElement(By.className("ui-datepicker-month")).getText();
		 yearc = driver.findElement(By.className("ui-datepicker-year")).getText();
			 
			 driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='29']")).click();
		}
	}

}
