package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the element
		WebElement mouseOverElement=driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		
		Actions mo=new Actions(driver);
		mo.moveToElement(mouseOverElement).perform();		
		
	}

}
