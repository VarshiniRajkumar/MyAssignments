package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//locate the element
		WebElement mouseScrollDown=driver.findElement(By.xpath("//span[contains(text(),'© 1996-2025, Amazon.com, Inc. or its affiliates')]"));
		
		Actions mouseScrollDownEvent=new Actions(driver);
		mouseScrollDownEvent.scrollToElement(mouseScrollDown).perform();
		
		String text=mouseScrollDown.getText();
		System.out.println(text);
		
	}

}
