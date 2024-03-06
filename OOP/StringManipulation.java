public class StringManipulation {

	public static void main(String[] args) {

		String s = "Hello, world!";
		System.out.println("Original string: " + s);

		// Convert to uppercase using the toUpperCase() method
		String uc_s = s.toUpperCase();
		System.out.println("\nUppercase string: " + uc_s);

		// Convert to lowercase using the toLowerCase() method
		String lc_s = s.toLowerCase();
		System.out.println("\nLowercase string: " + lc_s);

		int index = s.indexOf('o'); // Find first occurrence of 'o' in the string
		if (index != -1) 
			System.out.println("\nFirst occurrence of 'o': " +	 index);
		else
			System.out.println("\n'o' not found");

		// Use substring() method to extract part of a string
		String sub_s = s.substring(7, 12); // Extract characters from position 7 to 12
		System.out.println("\nSubstring from position 7 to 12: " + sub_s);
	}

}