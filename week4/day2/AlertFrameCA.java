package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrameCA {

	public static void main(String[] args) {
		
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			
			WebElement iframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
			driver.switchTo().frame(iframe);
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			
			//handling alert
			Alert alert=driver.switchTo().alert();
			alert.accept();
			
			String validateText=driver.findElement(By.id("demo")).getText();
			System.out.println(validateText);

	}

}
