package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/*
	 * No such element exception:1)when locator goes wrong
	 * 2)when proper wait statements are not provided
	 * 3)webelement trying to interact with it is present inside a frame
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();

	}

}