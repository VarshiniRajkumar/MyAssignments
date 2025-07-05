package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("guest");
		
		ChromeDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.partialLinkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		
		String leadID=driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).getText();
		
		System.out.println("The Lead ID is "+leadID);
		
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
	
	
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(leadID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement noRecordFound=driver.findElement(By.xpath("//div[text()='No records to display']"));
		
		
	
		if(noRecordFound.isDisplayed()) {
			System.out.println("The Lead is deleted successfully");
		}
		else {
			System.out.println("The Lead is not delete yet, check again");
		}

		driver.close();
	}

}