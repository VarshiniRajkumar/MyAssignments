package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("This is open incognito from chrome ---->subclass chrome");
	}
	
	public void clearCache() {
		System.out.println("Clear the cache from Chrome ---> subclass chrome");
	}
	
	public static void main(String[] args) {

		Chrome c=new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		c.openIncognito();
		c.clearCache();
	}

}
