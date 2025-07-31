package week5.day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SnapDealHA {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions mensMouse = new Actions(driver);
		mensMouse.moveToElement(mensFashion).perform();
		
		//click sports shoes
		WebElement shoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		shoes.click();
		
		//print sports shoes count
		String shoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Sports Shoes Count : " + shoesCount);
		
		WebElement trainingShoes = driver.findElement(By.xpath("//div[normalize-space()='Training Shoes']"));
		trainingShoes.click();
		
		Thread.sleep(1000);
		//click sort dropdown
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		sort.click();
		//select low to high option
		WebElement lowToHigh = driver.findElement(By.xpath("//li[normalize-space()='Price Low To High']"));
		lowToHigh.click();
		
		//choose the price value
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("600");
		
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1000");
		
		WebElement clickGo = driver.findElement(By.xpath("//div[contains(text(),'GO')]"));
		clickGo.click();
		
		//filter by color
		
		WebElement colorFilter = driver.findElement(By.xpath("//label[contains(., 'White') and contains(., 'Blue')]"));
		colorFilter.click();
		
		Thread.sleep(1000);
		
		//Mouseover on first shoe
		WebElement quickView = driver.findElement(By.xpath("(//div[@class='product-tuple-image'])[1]"));
		Actions hoverQuickView = new Actions(driver);
		hoverQuickView.moveToElement(quickView).perform();
		
		//click on quick view
		
		WebElement clickQuickView = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		clickQuickView.click();
		
		Set<String> switchhandle = driver.getWindowHandles();
		List<String> sh = new ArrayList<String>(switchhandle);
		driver.switchTo().window(sh.get(1));
		
		//print price and discount
		
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price of the Shoe is : Rs."+ price);
		
		String discount = driver.findElement(By.xpath("//span[contains(@class,'percent-desc')]")).getText();
		System.out.println("Discount of the Shoe is : Rs."+ discount);
		
		//getting snapshot of the shoe
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/img.png");
		FileHandler.copy(source, dest);
	
		driver.close();
        driver.switchTo().window(sh.get(0)).close();
	
	
	}

}