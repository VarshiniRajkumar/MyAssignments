package week3.day2;

public class Car extends Vehicle {
	
	public void steering() {
		System.out.println("Adujusting the controls --->sub class/car class");
	}
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.steering();
		c.applyBreak();
		c.applyGear();
		c.soundHorn();

	}

}
