package week1.day2;

public class IsPrime {

	  public static void main(String[] args) {

	    int num = 13;
	    boolean notPrime = false;

	    // 0 and 1 are not prime numbers
	    if (num == 0 || num == 1) {
	        notPrime = true;
	    }

	    for (int i = 2; i <= num - 1; i++) {

	      if (num % i == 0) {
	        notPrime = true;
	        break;
	      }
	    }

	    if (!notPrime)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
}
	