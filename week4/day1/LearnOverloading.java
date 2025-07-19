package week4.day1;

public class LearnOverloading {
	// Overloading: the method signature is same and but different parameters

	public void reportStep(String msg, String status) {
		System.out.println("Message from version 1: "+ msg);

		System.out.println("Status from version 1: "+ status);
}
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message from version 2: "+ msg);

		System.out.println("Status from version 2: "+ status);
		
		System.out.println("Snap from version 2: "+ snap);
		

	}

	
	public void takeSnap(String takesnap) {
		System.out.println("Snap shoted successfully ...." +takesnap);
	}
	public static void main(String[] args) {
		LearnOverloading ol=new LearnOverloading();
		ol.reportStep("version 1 message", "version 1 status");
		ol.reportStep("version 2 message", "version 2 status", true);
		ol.takeSnap("overloading");
		

	}

}
