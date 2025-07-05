package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDD {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
//		ChromeDriver driver = new ChromeDriver(options);
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Account test leaf 1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//selecting company software as industry dd
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByIndex(3);
		
		//- Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel2=new Select(ownershipDD);
		sel2.selectByVisibleText("S-Corporation");
		
		//- Select "Employee" as the source using SelectByValue.
		WebElement sourceDD = driver.findElement(By.name("ownershipEnumId"));
		Select sel3=new Select(sourceDD);
		sel3.selectByIndex(4);
		
		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.

		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
	    Select sel4=new Select(marketingCampaignDD);
	    sel4.selectByIndex(6);
	    
	    //- Select "Texas" as the state/province using SelectByValue.
		WebElement StateProvinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select sel5=new Select(StateProvinceDD);
	    sel5.selectByVisibleText("Texas");
	    
	    //- Click the "Create Account" button.
	    driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());

	}

}
