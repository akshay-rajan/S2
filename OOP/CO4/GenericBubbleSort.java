// 9. Using generic method perform Bubble sort.

public class GenericBubbleSort {
    
    // * Generic Method
    static <T extends Comparable<T>> void BubbleSort(T[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Integer[] nums = {3, 2, 6, 25, 22, 10, 0};
        BubbleSort(nums);
        for (Integer i: nums) System.out.print(i + " ");
        System.out.println();
        
        String[] words = {"harry", "ron", "hermione", "malfoy", "dumbledore"};
        BubbleSort(words);
        for (String i: words) System.out.print(i + " ");
        System.out.println();

    }

}
  
