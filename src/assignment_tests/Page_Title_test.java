package assignment_tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Page_Title_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Write Selenium script to confirm whether the application displays manzoormehadi26@gmail.com upon succesful login	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nasheeda_haneef@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.className("login-button")).click();
		WebElement userEmail = driver.findElement(By.linkText("nasheeda_haneef@yahoo.com"));
		Assert.assertEquals(userEmail.getText(),"nasheeda_haneef@yahoo.com");
		driver.quit();
			

	}

}
