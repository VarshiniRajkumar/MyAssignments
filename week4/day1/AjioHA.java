package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHA {

    public static void main(String[] args) throws InterruptedException {

        // Launch the browser
        ChromeDriver driver = new ChromeDriver();

        // 1. Open Myntra and wait for it to load
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Search for "bags"
        WebElement searchBox = driver.findElement(By.className("desktop-searchBar"));
        searchBox.sendKeys("bags", Keys.ENTER);

        // 3. Wait for results to load
        Thread.sleep(3000);

        // 4. Click on the "Men" filter (example filter)
        WebElement menFilter = driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
        menFilter.click();

        // Wait a bit for UI to update
        Thread.sleep(3000);
        
        WebElement handBags=driver.findElement(By.xpath("//label[contains(text(),'Handbags')]"));
        handBags.click();

        // Wait a bit for UI to update
        Thread.sleep(3000);

        System.out.println("Search and filter applied successfully!");

        
        // 4. Print count of items found
        WebElement countElement = driver.findElement(By.className("title-count"));
        System.out.println("Total items found: " + countElement.getText());
        
        // 5. Get the list of brand elements
        List<WebElement> brandElements = driver.findElements(By.className("product-brand"));
        
     // Use Set to avoid duplicates
        Set<String> brandSet = new HashSet<>();
        for (WebElement brand : brandElements) {
            brandSet.add(brand.getText());
        }
        
        System.out.println("\nBrands displayed:\n");
        for (String brand : brandSet) {
            System.out.println("- " + brand);
        }
        
        // 6. Get the list of bag names (product names)
        List<WebElement> productNames = driver.findElements(By.className("product-product"));

        System.out.println("\nBag Names:\n");
        for (WebElement product : productNames) {
            System.out.println("- " + product.getText());
        }
        
    }
}
