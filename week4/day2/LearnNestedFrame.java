package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	/*no such frame exception
	 * parent frame--->switch back to the immediate frame
	 * default content---->switch out of all the frames
	 */
	 

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle the frame
		WebElement nesFrame = driver.findElement(By.xpath("//h5 [contains(text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nesFrame);
		//innerframe
		driver.switchTo().frame("frame2");
		//webelement
		driver.findElement(By.id("Click")).click();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}