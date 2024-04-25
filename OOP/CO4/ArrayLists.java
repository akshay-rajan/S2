// 10. Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.ArrayList;


public class ArrayLists {
    
    public static void main(String[] args) {
    
        ArrayList<String> strings = new ArrayList<>();

        // Add elements
        strings.add("apple");
        strings.add("orange");
        strings.add("grapes");

        // Print the ArrayList
        System.out.println(strings);

        // Retrieve by index
        String s = strings.get(1);
        System.out.println("String at index 1: " + s);

        // Insertion at a position
        strings.set(1, "banana");
        System.out.println("Inserted 'banana' at index 1\n" + strings);

        // Size
        System.out.println("Size: " + strings.size());

        // Deletion 
        strings.remove(1);
        System.out.println("Deleted 'banana' from index 1\n" + strings);

        // Clearing the list
        strings.clear();
        System.out.println("Cleared the Arraylist!");
        
    }

}
