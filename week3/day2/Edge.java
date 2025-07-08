package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		System.out.println("This is takeSnap from Edge ---->subclass Edge");
	}

	public void clearCookies() {
		System.out.println("Clear the cookies from Edge ----> subclass Edge");
	}

	public static void main(String[] args) {
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
		e.takeSnap();
		e.clearCookies();
	}

}
