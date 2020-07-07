package assignment_tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Radio_Link {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		//write a selenium script to identify number of links & radio buttons present in the resitration page.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		//To identify total number of Radio buttons on Registration page
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio buttons: " +radioBtns.size());
		
		//To identify total number of Radio buttons on Registration page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: " +links.size());
		
		//Print all links
		for (int i = 1;i<links.size();i=i+1)
		{
			System.out.println(links.get(i).getText());
		}
		
		driver.quit();
		
		
	}
         
}
