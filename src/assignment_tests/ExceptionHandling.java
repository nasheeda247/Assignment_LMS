package assignment_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	
		WebElement username = driver.findElement(By.name("userName"));
		try {
			if (username.isEnabled()) {
				username.sendKeys("nasheeda");
			}
		}
		catch(NoSuchElementException e) {
			
			System.out.println("e.toString()");
		}
		

	}

}
