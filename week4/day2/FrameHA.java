package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handle the frame first
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
				
		//click the button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Handle the alerts
		Alert alert=driver.switchTo().alert();
		String text="Varshini";
		alert.sendKeys(text);
		alert.accept();
		
		Thread.sleep(3000);
		
		
		//validation of typed text
		String typedText=driver.findElement(By.id("demo")).getText();
		if(typedText.contains(text)){
			System.out.println("The typed text is " +text);
		}
		
		else {
			System.out.println("Alert dismissed...");
		}
		


	}

}
