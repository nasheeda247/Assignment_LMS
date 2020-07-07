package assignment_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write selenium script to check whether sort by list box of demowebshop application has 6 values
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Desktops")).click();
		Select sort_by = new Select(driver.findElement(By.id("products-orderby")));
		int i=0, total;
		total = sort_by.getOptions().size();
		System.out.println("The Sort by list box has " +total+ " values");
		driver.quit();

	}

}
