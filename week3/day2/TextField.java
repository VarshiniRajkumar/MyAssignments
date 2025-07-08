package week3.day2;

public class TextField extends WebElement {
	
	
	public void getText() {
		System.out.println("This is get Text from text field --->sub class");
	}
	
	
	
	public static void main(String[] args) {
		TextField t=new TextField();

		t.click();
		t.setText("Text Field");
		t.getText();
	}
	

}
