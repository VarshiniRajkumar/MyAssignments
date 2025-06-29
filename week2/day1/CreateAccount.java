package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// setup browser driver
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		// load the url
		driver.get("http://leaftaps.com/opentaps/");
		// enter username and password and login to the site
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();

		// In create Account section, create the account and enter account name,
		// description, number of employees, Site name
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TEST LEAF ACCOUNT");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("100");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		// Click the create account button and verify the title displayed successfully
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		//close the web driver
		driver.close();


	}

}
