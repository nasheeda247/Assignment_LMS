package assignment_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write selenium script to check page title before & after login
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		//Check Page title before login
		String titleBeforeLogin = driver.getTitle();
		System.out.println(titleBeforeLogin);
		
		//Check Page title after login
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nasheeda_haneef@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.className("login-button")).click();
		String titleAfterLogin = driver.getTitle();
		System.out.println(titleAfterLogin);
		driver.quit();

	}

}
