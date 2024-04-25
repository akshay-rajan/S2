// 17. Program to demonstrate the working of Map interface by adding, changing and removing elements.

import java.util.Map;
import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {
        
        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of characters in a string
        String s = "Hello, World!";
        for (Character ch: s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        
        // Remove ' ' key
        map.remove(' ');
        System.out.println(map);
        
    }
    
}
