package assignment_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write selenium script to verify whether entered value in the username textbox mercury new tours demo is manzoor
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("manzoor");;
		System.out.println(driver.findElement(By.name("userName")).getAttribute("value"));
		driver.quit();
		

	}

}
