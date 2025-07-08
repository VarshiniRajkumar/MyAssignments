package week3.day2;

public class Safari extends Browser {

	public void readerMode() {
		System.out.println("This is read mode from Safari ----> subclass safari");
	}

	public void fullScreenMode() {
		System.out.println("This is fullscreen mode from Safari ---->subclass safari");
	}

	public static void main(String[] args) {
		Safari s = new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
		s.readerMode();
		s.fullScreenMode();

	}
}
