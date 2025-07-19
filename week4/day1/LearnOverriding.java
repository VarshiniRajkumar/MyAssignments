package week4.day1;

public class LearnOverriding extends LearnOverloading {

	//same method and same parameters from super class
	
	public void takeSnap(String takesnap) {
		System.out.println("snapshot taken from sub class..."+takesnap);
	}
	
	public void reportStep(String msg, String status ) {
		System.out.println("Message from : "+ msg);

		System.out.println("Status from version 1: "+ status);	}
	public static void main(String[] args) {
		
		LearnOverriding or=new LearnOverriding();
		or.takeSnap("Overiding");
		or.reportStep("Over riding message", "Over riding status");
		or.reportStep("over riding from super class message", "over riding from super class status", false);

	}

}
