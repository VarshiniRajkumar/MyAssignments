package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
	
		int n1[]= {1,2,3,4,5,6};
		int n2[]= {1,6,8,9,8,7};
		
		for(int i=0;i<n1.length;i++) {
			for(int j=0;j<n2.length;j++) {
				if(n1[i]==n2[j]) {
					System.out.println("intersected value: "+n1[i]);
				}
			}
		}

	}

}
