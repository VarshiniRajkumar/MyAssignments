package week3.day2;

public class Button extends WebElement{
	
	
	public void submit() {
		System.out.println("This is submit from button --->sub class");
	}
	
	
	
	public static void main(String[] args) {
		Button b=new Button();
		b.click();
		b.setText("Button");
		b.submit();
	}

}
