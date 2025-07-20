package caseStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2PVR {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//launch url
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Select Cinema option
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		//select the Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();	
		Thread.sleep(1000);
		
		//select Theatre name
		driver.findElement(By.xpath("//li[@class='p-dropdown-item'][1]")).click();
		Thread.sleep(1000);
		
		//select the date
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		Thread.sleep(1000);
		
		//select the movie
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		Thread.sleep(1000);
		
		//select the timing
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		Thread.sleep(1000);
		
		//booking
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']")).click();
		Thread.sleep(3000);
		
		//accepting terms and conditions
		driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
		Thread.sleep(1000);
		
		//seat selection
		driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
		Thread.sleep(1000);
		
		//proceed
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		Thread.sleep(1000);
		
		//seat info
		WebElement seatno=driver.findElement(By.xpath("//div[@class='seat-number']/p"));
		String SeatNumber=seatno.getText();
		System.out.println("The seat number is "+SeatNumber);
		Thread.sleep(1000);
		
		//print grand total
		WebElement grandtotal=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span"));
		String TotalAmount=grandtotal.getText();
		System.out.println("The grand total is "+TotalAmount);
		Thread.sleep(1000);
		
		//click on continue button
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		Thread.sleep(3000);
		
		//Closing the Pop up
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
		Thread.sleep(1000);
		
		//printing the current page title
		System.out.println(driver.getTitle());
		Thread.sleep(1000);        

	}

}
