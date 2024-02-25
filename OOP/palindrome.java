public class Palindrome {
    public static void main(String[] args) {
        int n = 123421;
        int temp = n;
        int reversed = 0;
        
        while (temp != 0) {
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        }
        System.out.println(n == reversed);
    }
}
    