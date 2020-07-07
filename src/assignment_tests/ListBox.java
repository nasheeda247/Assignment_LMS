package assignment_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write selenium script to verify whether fromport of newtours demo application has 10 elements
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("nasheeda");
		driver.findElement(By.name("password")).sendKeys("pass123$");
		driver.findElement(By.name("login")).click();
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		int i=0, total;
		total = fromPort.getOptions().size();
		System.out.println("The total number of elements in fromPort is: " +total);
		driver.quit();

	}

}
