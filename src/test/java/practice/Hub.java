package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hub {

	public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://secure.business.bt.com/Hub");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Accept all cookies']")).click();
		
	}

}
