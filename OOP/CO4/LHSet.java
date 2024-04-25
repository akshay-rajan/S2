// 15. Program to demonstrate the creation of Set object using the LinkedHashset class 

import java.util.Set;
import java.util.LinkedHashSet;


public class LHSet {

    public static void main(String[] args) {
        
        Set<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
        
        set.remove(1);
        System.out.println(set);

        System.out.println("set.contains(2): " + set.contains((2)));

    }
    
}
