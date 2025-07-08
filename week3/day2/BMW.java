package week3.day2;

public class BMW extends Car {
	
	public void voiceCommand() {
		System.out.println("This is voic command from BMW ---->child");
	}

	public void turn() {
		System.out.println("This is turn method from the BMW ----->child");
	}
	
	public static void main(String[] args) {
		BMW bmw=new BMW();
		bmw.applyBreak();
		bmw.steering();
		bmw.turn();
	
	}
}
