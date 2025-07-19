package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingListHA {

	public static void main(String[] args) {
		// Declare a List with the given elements

		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 1,2, 3, 4, 10, 6, 8);
		System.out.println(numbers);
		
		// Sort the list in ascending order

		Collections.sort(numbers);
		System.out.println(numbers); //[1,2,3,4,6,8,10]
		
		for(int i=0;i<numbers.size()-1;i++) {
			int current = numbers.get(i);
			int next=numbers.get(i+1);
			
			if(current+1 != next) {
				for(int j=current+1;j<next;j++) {
					System.out.println("Missing number is: "+j);
				}
			}
			
		}
		
		

	}

}
