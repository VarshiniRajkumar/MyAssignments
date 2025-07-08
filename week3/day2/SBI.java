package week3.day2;

public class SBI extends Axis implements RBI {

	@Override
	public void withDrawal() {
		// TODO Auto-generated method stub
		
		System.out.println("this is withdrawal");
		
	}
	
	public void knowYourCustomer() {
		System.out.println("This is kyc");
	}

	
	public void goldLoad() {
		System.out.println("This is gold loan");
	}
	public void withDrawalAxis() {
		System.out.println("This is withdrawalAxis from sbi");
	}
	
	public static void main(String[] args) {
		SBI s= new SBI();
		s.goldLoad();
		s.knowYourCustomer();
		s.withDrawal();
		s.withDrawalAxis();
		s.withDrawalAxis();
	}
}
