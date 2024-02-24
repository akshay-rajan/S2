
class prime {

    public static void main(String[] args) {
        int n = 2;
        int flag = 0;
        for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                                flag++;
                    }
        } 
        if (flag == 0) {
                    System.out.print("Prime");          
        } else {
                    System.out.println("Not Prime");  
        }
    }
}
