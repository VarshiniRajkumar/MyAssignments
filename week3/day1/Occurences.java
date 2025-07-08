package week3.day1;

public class Occurences {

	public static void main(String[] args) {

		String input = "saranya";
		int count = 0;
		
		char[] Characters=input.toCharArray();
		System.out.println(Characters);
		
		for(int i=0;i<Characters.length;i++) {
			if(Characters[i]=='a') {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
