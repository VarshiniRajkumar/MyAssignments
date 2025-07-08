package week3.day2;

public class Auto extends Vehicle {
	
	public void applyMeter() {
		System.out.println("This is meter coming from Auto --->subclass");
	}
	
	
	public static void main(String[] args) {
		Auto a=new Auto();

		a.applyGear();
		a.applyMeter();
	}
	

}
