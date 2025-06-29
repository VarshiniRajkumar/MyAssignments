package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// setup browser driver
		EdgeDriver driver=new EdgeDriver();
		//Load the url website
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Enter username password and login verify
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//In Create lead section, enter first name, last name, company name and title 
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Varshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajkumar");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TEST LEAF IS A TITLE OF THE COMPANY");
		
		//Click create lead button and verify title displayed correctly
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
