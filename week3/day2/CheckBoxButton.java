package week3.day2;

public class CheckBoxButton extends Button {

	public void clickCheckButton() {
		System.out.println("This is click check button from child class --->child class of Button subclas");
	}

	public static void main(String[] args) {
		CheckBoxButton checkbox = new CheckBoxButton();
		checkbox.click();
		checkbox.setText("Checkbox");
		checkbox.submit();
		checkbox.clickCheckButton();
	}
}
