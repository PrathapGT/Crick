package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demotestscript {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("Prathap");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		String contactheader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(contactheader.contains("Prathap")) {
			System.out.println(contactheader+"pass");
		}
		else {
			System.out.println("fail");
		}
		
		
	}

}
