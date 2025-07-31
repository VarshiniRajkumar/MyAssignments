package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter "MAS" as From Station
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS");

		// Enter "MDU" as To Station
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");

		Thread.sleep(1000);

		// Uncheck sort on date
		WebElement dateCheck = driver.findElement(By.id("chkSelectDateOnly"));
		if (dateCheck.isSelected()) {
			dateCheck.click();
		}

		Thread.sleep(3000); 

		// get table in list
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]//tr/td[2]"));

		
		// Remove duplicates and store unique train names
        Set<String> uniqueTrainNames = new HashSet<>();

        for (WebElement train : trainNames) {
        	uniqueTrainNames.add(train.getText());
        }

        // Print unique train names
        System.out.println("Unique Train Names:");
        for (String name : uniqueTrainNames) {
            System.out.println(name);
        }
		
	}
}
