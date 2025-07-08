package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(arr);
		
		//arr[]={1,2,3,4,6,7,8}
		
		for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
			if (i != arr[i - arr[0]]) {
				//1 1
				//2 2
				//3 3
				//4 4
				//5 6
                System.out.println("Missing number is: " + i);
                break;
			
		}

	}

	}
}