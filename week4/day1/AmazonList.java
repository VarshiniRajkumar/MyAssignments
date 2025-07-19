package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class AmazonList {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones",Keys.ENTER);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//getting all the prices tag by class name
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[@class='a-price-whole']"));// ctrl+2,L

		int size = allLinks.size();
		System.out.println(size);
		
		List<Long> priceList=new ArrayList<Long>();
		for(WebElement each:allLinks) {
			String priceText=each.getText();
			String replaceAll=priceText.replaceAll(",", "");
			
			long mob=Integer.parseInt(replaceAll);
			priceList.add(mob);
		}
		
		System.out.println(priceList);

	}

}
