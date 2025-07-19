package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestElementHA {

	public static void main(String[] args) {

		// Creating array of numbers
		int[] unOrderedNumbers = { 3, 2, 11, 4, 6, 7 };
		
		

		// Convert array of numbers to list
		List<Integer> list = new ArrayList<Integer>();

		for (int i : unOrderedNumbers) {
			list.add(i);

		}
		

		// sort the numbers into ascending
		Collections.sort(list);
		
		

		// getting second largest element in the list
		int SecondLargest = list.get(list.size() - 2);
		
		
		// printing second largest element in the list
		System.out.println("The second largest element in the list is: " + SecondLargest);

	}

}
