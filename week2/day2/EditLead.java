package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.partialLinkText("Leads")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("EditLead company");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Varsh");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raj");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("First name local");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Department name");
		
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Learn to edit lead in selenium");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("iamvarshraj@gmail.com");
		
        WebElement state=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		Select sel = new Select(state);
		
		sel.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys("Description is edited");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
//				
//		
//		System.out.println(driver.getTitle());
	
		
	}

}