// 1. Program to Sort strings

public class Sort {
    
    public static void main(String[] args) {
    
        String[] arr = {"Sugarcane", "Apple", "Banana", "Mango", "Pineapple"};
        int n = arr.length;
        
        System.out.print("Array of Strings: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // * Bubble Sort
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

    }

}
