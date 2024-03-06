public class StringManipulation {

	public static void main(String[] args) {

		String s = "Hello, world!";

		System.out.println("Original string: " + s);
		String uc_s = s.toUpperCase();
		System.out.println("\nUppercase string: " + uc_s);
		String lc_s = s.toLowerCase();
		System.out.println("\nLowercase string: " + lc_s);
		int index = s.indexOf('o');
		if (index != -1) 
			System.out.println("\nFirst occurrence of 'o': " +	 index);
		else
			System.out.println("\n'o' not found");

		// Use substring() method to extract part of a string
		String sub_s = s.substring(7, 12); // Extract characters from position 7 to 12
		System.out.println("\nSubstring from position 7 to 12: " + sub_s);


	}

}