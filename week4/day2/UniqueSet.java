package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueSet {

	public static void main(String[] args) {
     String browser="google";
     
     char[] browserChar=browser.toCharArray();
     Set<Character> unique=new LinkedHashSet<Character>();
     for(int i=0;i<browserChar.length;i++) {
    	 unique.add(browserChar[i]);
     }
     
		System.out.println(unique);
	}

}
