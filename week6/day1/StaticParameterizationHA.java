package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StaticParameterizationHA {
	@Test
	@Parameters({"url","username","password"})
	public void StaticParam(String url, String username, String password) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//entering user name and password
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		//submit login
		driver.findElement(By.id("Login")).click();

		
		//click on toggle button
		WebElement toggleButton = driver.findElement(By.xpath("//div[@class='slds-r4']"));
		toggleButton.click();
		
		Thread.sleep(5000);
		
		//click on view all option
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		viewAll.click();
		Thread.sleep(5000);

		
		//click on legal entities
		WebElement legalEntity = driver.findElement(By.xpath("//p[normalize-space()='Legal Entities']"));
		Actions legal = new Actions(driver);
		legal.scrollToElement(legalEntity).perform();
		legalEntity.click();
		Thread.sleep(5000);

		
		//click new button
		WebElement newButton = driver.findElement(By.xpath("//a[@title='New']"));
		newButton.click();
		
		//click on new entity, company name and description
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Varshini");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		Thread.sleep(1000);
		WebElement status = driver.findElement(By.xpath("//button[@data-value='--None--']"));
//		status.click();
//		
//		driver.findElement(By.xpath("//button[@data-value='Active']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", status);
		
		
		
		WebElement Active = driver.findElement(By.xpath("//span[text()='Active']"));
		Active.click();
		
		WebElement savebutton = driver.findElement(By.xpath("//button[text()='Save']"));
		savebutton.click();
		
		WebElement msg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
		System.out.println("Displayed message : "+ msg.getText());
		
		
	}

}
