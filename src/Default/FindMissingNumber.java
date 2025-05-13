package Default;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] arr = { -9, -8, 1, 6, 4, 2, 3 };

		// Find the lowest number using a loop
		int lowest = arr[0]; // Initialize with the first element of the array

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < lowest) {
				lowest = arr[i]; // Update lowest if a smaller number is found
			}
		}

		System.out.println("The lowest number is: " + lowest);

		int highest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > highest) {
				highest = arr[i]; // Update lowest if a smaller number is found
			}
		}
		
		System.out.println("highest number is " + highest);

		int[] arr1 = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		System.out.println(arr1);
		
		
		
//		int[] arr = new int[] { -9, -8, 1, 6, 4, 2, 3 };

		HashSet<Integer> set = new HashSet();

		for (int num : arr) {
			set.add(num);
		}
		System.out.println(set);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = lowest; i < highest; i++) {
			if (!set.contains(i));
			list.add(i);
		}
		System.out.println(list.toString());

	}

}
