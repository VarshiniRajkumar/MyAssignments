package week1.day2;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 454, r, sum = 0, original;
		original = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (original == sum) {
			System.out.println(original + " is palindrome");
		} else if (original != sum) {
			System.out.println(original + " not palindrome");
		}

	}

}
