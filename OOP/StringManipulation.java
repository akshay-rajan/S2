public class StringManipulation {

	public static void main(String[] args) {

		String s = "Hello, world!";

		System.out.println("Original string: " + s);
		String lc_s = s.toLowerCase();
		System.out.println("\nLowercase string: " + lc_s);
		String uc_s = s.toUpperCase();
		System.out.println("\nUppercase string: " + uc_s);
		String re_s = s.replace("o", "e");
		System.out.println("\nReplaced string: " + re_s);
		
		String s1 = "Hello";
		String s2 = "hello";
		if (s1.equals(s2)) {
			System.out.println("The strings are equal!");
		} else {
			System.out.println("The strings are not equal!");
		}
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("The strings are equal case-insensitively!");
		} else {
			System.out.println("The strings are not equal case-insensitively!");
		}
		
		System.out.println("The length of the string is " + s.length());
		System.out.println("The character at position 5 is " + s.charAt(5));
		if (s1.compareTo(s2) < 1) {
			System.out.println(s1 + "is less than " + s2);
		} else if (s1.compareTo(s2) > 1) {
			System.out.println(s1 + "is greater than " + s2);
		} else {
			System.out.println("The strings are equal");
		}
		


	}

}