package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxHomeAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']")).click();

		WebElement basicCheckBox = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt89_input']"));
		WebElement ajaxCheckBox = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']"));

		if (basicCheckBox.isSelected()) {

			System.out.println("the basic is selected");
		} else {
			System.out.println("the basic is not selected");
		}

		if (ajaxCheckBox.isSelected()) {
			System.out.println("the Ajax is selected");

		} else {
			System.out.println("the Ajax is not selected");
		}

		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/parent::td) [1]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();

		//To check state1 pop up works after clicked tristate
		WebElement stateCheck = driver.findElement(By.xpath("//p[text()='State = 1']"));

		if (stateCheck.isDisplayed()) {
			System.out.println("The Tri-state option is State 1");
		}

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		//To check the toggle switch is selected or not
		WebElement toggleSwitch = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input']"));

		if (toggleSwitch.isSelected()) {
			System.out.println("The Toggle switch is enabled");
		} else {
			System.out.println("The toggle switch is disabled");

		}	
		
		//To check whether the disable check box is enabled or disabled
		WebElement disablecheckbox=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
		
		if (disablecheckbox.isEnabled()) {
			System.out.println("The checkbox is enabled");
		} else {
			System.out.println("The checkbox is disabled");
		}

		//click multiple cities
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		//choose the Paris as the option
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		
		driver.close();
	

	}

}