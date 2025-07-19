package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHA {

	public static void main(String[] args) throws InterruptedException {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Load url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//click the show in the prompt box
		WebElement prompt=driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		prompt.click();
		
		//Switch to the alert
        Alert alert = driver.switchTo().alert();
        
        
        //type the text in the alert box
        String typedName="Varshini";
		alert.sendKeys(typedName);
		
		//dismiss the prompt
		alert.dismiss();

		// Wait for a short time to ensure result message is updated
        Thread.sleep(1000);
        
        // Retrieve and verify the message displayed on the page
        String finalText = driver.findElement(By.id("confirm_result")).getText();
        
        //Check whether the typed text is accepted or dismissed
        
        if(finalText.contains(typedName)) {
        	System.out.println("User entered name and the name is present and prompt accepted: "+typedName);
        }
        else {
        	System.out.println("User entered name is not present after the dismiss...");
        }

	}

}
