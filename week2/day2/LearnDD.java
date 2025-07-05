package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//first need to locate the dropdown field
//After that put that locator in one local variable of webselement, since you need to pass the webelement as argument.
//Then create obj/constructor for select class and pass the webelement as argument, then select by index or value using that obj sel.

public class LearnDD {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();

		// click lead
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Varshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajkumar");

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDD);
		sel.selectByIndex(4);

		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(marketingCampaign);
		sel1.selectByVisibleText("Automobile");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new Select(ownership);
		sel2.selectByValue("OWN_CCORP");

		driver.findElement(By.name("submitButton")).click();

		driver.close();

	}

}
