package week3.day2;

public class Browser {
	
	String browserName, browserVersion;
	
	public void openURL() {
		System.out.println("This is openURL from Browser class ----> super class");
	}
	
	public void closeBrowser() {
		System.out.println("This is closebrowser from Browser class ----> super class");
	}
	
	public void navigateBack()
	{
		System.out.println("This is navigate back from Browser class ----> super class");
	}

}
