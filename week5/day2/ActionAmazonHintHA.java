package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ActionAmazonHintHA {
	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver=new EdgeDriver();
		
		//Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		//2. Search for "oneplus 9 pro".		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus9 pro");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(3000);
		
		//get the price of the first displayed product
		WebElement price = driver.findElement(By.xpath("//span[@id='tp_price_block_total_price_ww']"));
        System.out.println(price.getText());
        price.click();
        Thread.sleep(3000);
        
        //get the ratings number
        WebElement ratings = driver.findElement(By.xpath("//span[@id='acrCustomerReviewText']"));
        System.out.println(ratings.getText());
        Thread.sleep(3000);
        
     // Click the first line of the text
        WebElement firstLineText = driver.findElement(By.xpath("//a[@id='bylineInfo']"));
        firstLineText.click();
        Thread.sleep(3000);

        // Take screenshot
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./snaps/ima.png");
        FileHandler.copy(source, dest);
        
	}
}
