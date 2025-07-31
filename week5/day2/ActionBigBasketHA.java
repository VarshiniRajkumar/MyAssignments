package week5.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBigBasketHA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		//shop by category
		
		WebElement ShopByCat = driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')])[4]"));
		ShopByCat.click();
		Thread.sleep(1000);
		
		//mouse over to food grains oil and masala
		WebElement foodgrainsMO = driver.findElement(By.xpath("//a[@role='none'][normalize-space()='Foodgrains, Oil & Masala']"));
		Actions fgmouse = new Actions(driver);
		fgmouse.moveToElement(foodgrainsMO).perform();
		
		//Mouse over to rice and rice products
		WebElement riceprodMO = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		Actions riceMouse = new Actions(driver);
		riceMouse.moveToElement(riceprodMO).perform();
		
		//click on boiled steamed rice		
		WebElement boiledSteamedRice = driver.findElement(By.xpath("//a[normalize-space()='Boiled & Steam Rice']"));
		boiledSteamedRice.click();
		
		// Select brand "bb Royal"
        Thread.sleep(3000);
        WebElement bbRoyalCheckbox = driver.findElement(By.xpath("//span[text()='BB Royal']/ancestor::label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bbRoyalCheckbox);
        Thread.sleep(1000);
        bbRoyalCheckbox.click();

        WebElement tamilPonni = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
        tamilPonni.click();

        // Switch to new window
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Select the 5 Kg bag
        Thread.sleep(3000);
        WebElement fiveKgOption = driver.findElement(By.xpath("//span[text()='5 kg']"));
        fiveKgOption.click();
        //verify the price
        String price=driver.findElement(By.xpath("//table/tr[2]/td[1]")).getText();
        System.out.println("The price of 5 kg: "+price);
        
		//add to basket
		WebElement clickAddToBasket = driver.findElement(By.xpath("//button[text()='Add to basket'][1]"));
		clickAddToBasket.click();
		
		String msg = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(msg);
		
		driver.close();
		
	}

}