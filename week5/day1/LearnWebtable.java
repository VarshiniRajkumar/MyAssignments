package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/table.xhtml");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// row count
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int size = row.size();
		System.out.println(size);
		// column count
		List<WebElement> colSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		int size2 = colSize.size();
		System.out.println(size2);
		// particular data
		WebElement parData = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]/td[2]"));
		System.out.println(parData.getText());
		// entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[2]"));
		for (WebElement rowIter : singleRow) {
			System.out.println(rowIter.getText());

		}
		// all datas
		List<WebElement> allData = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		for (WebElement iter : allData) {
			System.out.println(iter.getText());

		}
		System.out.println("-----------------------");

		// dynamic table
		for (int i = 1; i < row.size(); i++) {
			driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[" + i + "]/td"));
			System.out.println("------------------");

			for (int j = 1; j < colSize.size(); j++) {
				WebElement datas = driver
						.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.println(datas.getText());
			}

		}

	}

}