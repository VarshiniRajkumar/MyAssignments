package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");

		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Browser b=new Browser();
 System.out.println(b.launchBrowser("Chrome"));
 b.loadUrl(); 
	}

}
