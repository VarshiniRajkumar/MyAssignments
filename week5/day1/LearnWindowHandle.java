package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//address of the current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//A329388617865B2FA761412D3C98F057,62557627E09B779E20294C31E3B603E0
		System.out.println(driver.getTitle());
		//open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> childWindow = driver.getWindowHandles();
		//declare the list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to the child window
		/*
		 * driver.switchTo().window(listWindow.get(1));//childwindow String chWin =
		 * driver.getWindowHandle(); System.out.println(chWin);
		 * System.out.println(driver.getTitle());
		 */
		/*
		 * for (String wh : listWindow) { driver.switchTo().window(wh);
		 * System.out.println(driver.getCurrentUrl());
		 * 
		 * }
		 */
		for (int i = 0; i < listWindow.size(); i++) {
			String win = listWindow.get(i);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			
		}
		driver.close();
		driver.switchTo().window(listWindow.get(0));
		driver.close();
		
	}

}