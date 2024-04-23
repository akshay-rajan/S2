
class Prime {

    public static void main(String[] args) {
        int n = 2;
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag++;
            }
        } 
        
        String ans = flag == 0 ? "Prime" : "Not Prime";
        System.out.println(ans);
    }
}
