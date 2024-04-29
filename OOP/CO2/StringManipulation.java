// 3. Perform string manipulations

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {

		// Read a string
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		// toLowerCase, toUpperCase 
		System.out.println("Original string: " + s);
		String lc_s = s.toLowerCase();
		System.out.println("Lowercase string: " + lc_s);
		String uc_s = s.toUpperCase();
		System.out.println("Uppercase string: " + uc_s);

		// Replace a character in the string
		System.out.print("Enter a character to replace, and the character to replace it with: ");
		String c1 = sc.next();
		String c2 = sc.next();
		String re_s = s.replace(c1, c2);
		System.out.println("Replaced string: " + re_s);
		
		// Find the length of a string
		System.out.println("The length of the string " + s + " is " + s.length());
		
		// Find the character at a particular position
		System.out.print("Enter a position: ");
		int pos = sc.nextInt();
		System.out.println("The character at position " + pos + " is " + s.charAt(pos));

		// Remove White Spaces at the ends of a string
		s = "  Hello, world!  ";
		System.out.println("Original string: " + s);
		String trimmed_s = s.trim();
		System.out.println("Trimmed string: " + trimmed_s);

		// Return the position of first occurence of a character in a string
		System.out.print("Enter a character: ");
		String c = sc.next();
		System.out.println("The first occurence of " + c + " is at position " + s.indexOf(c));

		// Return the position of occurence of a character in a string after the nth position
		System.out.print("Enter a character and a position: ");
		c = sc.next();
		pos = sc.nextInt();
		System.out.println("The first occurence of " + c + " after position " + pos + " is at position " + s.indexOf(c, pos));

		// Convert a parameter value to string representation
		int i = 10;
		String i_string = String.valueOf(i);
		System.out.println("String representation of " + i + " is " + i_string);

		// ! Comparisons

		// Read two strings and check if they are equal - 'equals', 'equalsIgnoreCase'
		sc.nextLine();
		System.out.print("Enter string 1: ");
		String s1 = sc.nextLine();
		System.out.print("Enter string 2: ");
		String s2 = sc.nextLine();
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

		// Compare two strings
		if (s1.compareTo(s2) < 1) {
			System.out.println(s1 + " is less than " + s2);
		} else if (s1.compareTo(s2) > 1) {
			System.out.println(s1 + " is greater than " + s2);
		} else {
			System.out.println("The strings are equal");
		}
		
		// Concatenate two strings
		System.out.println("Concatenated string: " + s1.concat(s2));

		// Return the substring of a string
		System.out.print("Enter a string: ");
		String s3 = sc.nextLine();
		System.out.print("Enter the start and end positions: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println("s[:" + end + "]: " + s3.substring(end));
		System.out.println("s[" + start + ":" + end + "]: " + s3.substring(start, end));
		sc.close();

	}

}