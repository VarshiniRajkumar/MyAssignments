package week3.day1;

public class ReverseOdd {

	public static void main(String[] args) {
        String text = "I am a software tester";
        
        String[] words=text.split(" ");
        for(int i=0;i<words.length;i++) {
        	if(i%2!=0) {
        		char[] w=words[i].toCharArray();
        		
        		for(int j=w.length-1;j>=0;j--) {
        			System.out.print(w[j]);
        		}
        	}
        	else {
        		System.out.print(words[i]);
        	}
        	System.out.print(" ");
        }

		
		
		
	}

}
