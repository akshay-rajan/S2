import java.util.Scanner;


public class Search {

	static boolean linearSearch(int[] array, int target) {	
		for (int element:  array) { 
			if (element == target) 
				return true;
		}
		return false;
	}
	public static void main(String[] args) {

		// Linear Search
		int[] array = {2, 5, 21, 12, 40, 23};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to search for: ");
		int target = sc.nextInt();
		sc.close();
		if (linearSearch(array, target))
			System.out.println("Element found!");
		else 
			System.out.println("Element not found!");

	}

}
