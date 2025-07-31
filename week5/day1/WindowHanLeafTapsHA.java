package week5.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHanLeafTapsHA 
{
	public static void main(String[] args) 
			throws InterruptedException
	{
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Merge Contacts")).click();
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
        Thread.sleep(2000);

        //Switch to new window and select first contact
        Set<String> windowHandle1 = driver.getWindowHandles();
        String parentWindow = driver.getWindowHandle();
        for (String window : windowHandle1) 
        {
            if (!window.equals(parentWindow)) 
            {
                driver.switchTo().window(window);
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        
        //back to parent
        driver.switchTo().window(parentWindow); 

        //Click widget for To Contact
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
        Thread.sleep(2000);

        //Switch to new window and select To contact
        Set<String> windowHandle2 = driver.getWindowHandles();
        for (String window : windowHandle2) 
        {
            if (!window.equals(parentWindow)) 
            {
                driver.switchTo().window(window);
                break;
            }
        }
        driver.findElement(By.xpath("//a[text()='EuroCustomer']")).click();
        Thread.sleep(2000);
 
        //back to main
        driver.switchTo().window(parentWindow);

        //Click Merge
        driver.findElement(By.linkText("Merge")).click();
        Thread.sleep(1000);

        //Accept Alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Verify result
        String result= driver.getTitle();
        System.out.println("Page Title after Merging: " + result);
        if (result.contains("View Contact")) 
        {
            System.out.println("Merge successful");
        } 
        else 
        {
            System.out.println("Merge failed");
        }

        // Close browser
//        driver.quit();
    }
		}