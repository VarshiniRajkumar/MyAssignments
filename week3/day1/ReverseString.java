package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String companyName= "TestLeaf";
		
//		char[] rev=companyName.toCharArray();
//		
////printing original string
//		
//		System.out.print("Original String:");
//		System.out.println(rev);
////printing reversed string		
//		System.out.print("Reversed String:");
//		
//		for(int i=rev.length-1; i>=0;i--) {
//			
//			System.out.print(rev[i]);
//			
//		}
		
		
		String name="varshini";
		char[] characters=name.toCharArray();
		for(int i=characters.length-1;i>=0;i--) {
			System.out.print(characters[i]);
		}
		

	}

}
