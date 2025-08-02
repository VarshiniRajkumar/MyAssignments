package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicParameterizationHA {
	@Test(dataProvider="fetchData")
	@Parameters({"name","companyName","description"})
	public void StaticParam(String name, String companyName, String description) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//entering user name and password
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf@2025");
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
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(description);
		
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
	
	
	@DataProvider(name="fetchData")
	public String[][] passdata(){
		String[][] data = new String[3][3];
		data[0][0] = "Varshini";
		data[0][1] = "TestLeaf";
		data[0][2] = "Varshini description completed";
		
		data[1][0] = "Niya";
		data[1][1] = "TCS";
		data[1][2] = "Niya description completed";
		
		data[2][0] = "Vinoth";
		data[2][1] = "Accenture";
		data[2][2] = "Vinoth Accenture completed";
		
		return data;
	}
	

}
