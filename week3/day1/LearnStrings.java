package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {

		String name="arshraj";
		String name1="arshraj";
		
		//1.length()
		System.out.println(name.length());
		
		//2.equals()
		System.out.println(name.equals(name1));

		//3.ignorecase
		System.out.println(name.equalsIgnoreCase(name1));
		
		//4.contains()
		
		System.out.println(name.contains(name1));
		
		//5.toCharArray()
		char[] charArrayexample=name.toCharArray();
		System.out.println(charArrayexample[2]);
		
	}

}
