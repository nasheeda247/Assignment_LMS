package assignment_tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//Write selenium script to check whether selected value of fromport is present in toport of new tours demo application
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("nasheeda");
		driver.findElement(By.name("password")).sendKeys("pass123$");
		driver.findElement(By.name("login")).click();
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByVisibleText("London");
		Thread.sleep(3000);
		Select toPort = new Select(driver.findElement(By.name("toPort")));
		List<WebElement> all_options = toPort.getOptions();
		boolean found = false;
		
		for (WebElement we : all_options) {
			if("London".equalsIgnoreCase(we.getAttribute("value"))) {
				toPort.selectByValue("London");
				System.out.println("Present");
				found = true;
				break;
			}
		
		}
		
		driver.quit();

	}

}
