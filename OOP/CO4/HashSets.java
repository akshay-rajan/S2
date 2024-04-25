// 16. Write a Java program to compare two hash sets

import java.util.HashSet;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);

        if (set1.equals(set2)) {
            System.out.println("The sets are equal.");
        } else {
            System.out.println("The sets are not equal.");
        }

    }

}