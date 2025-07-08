package week3.day2;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("This is also child class select radiobutton from RadioButton --->another child class");
	}
	
	public static void main(String[] args) {
		RadioButton r=new RadioButton();
		r.click();
		r.setText("Radio button");
		r.submit();
		r.selectRadioButton();
	}
	

}
