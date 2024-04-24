// 2. Search an element in an array.

import java.util.Scanner;

public class Search {

	static int linearSearch(int[] array, int target) {	
		for (int i = 0; i < array.length; i++) { 
			if (array[i] == target) 
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		// Read an array and a number to search for
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.print("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) 
			array[i] = sc.nextInt();
		System.out.print("Enter the number to search for: ");
		int target = sc.nextInt();
		sc.close();

		// Search for the target
		int index = linearSearch(array, target);
		if (index == -1)
			System.out.println("Element not found!");
		else 
			System.out.println("Element found at index " + index);

	}

}
