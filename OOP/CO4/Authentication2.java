import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Authentication2 {
    
    // HashMap to store the users and their passwords
    static Map<String, String> accounts = new HashMap<>();

    // Log a user in after validating the username and password
    static void login(Scanner sc) {

        try {
            // Read and validate username
            System.out.print("Username: ");
            String username = sc.next();
            sc.nextLine();
            if (!accounts.containsKey(username)) {
                throw new UsernameException("Username does not exist!");
            }
            // Read and validate password
            System.out.print("Password: ");
            String password = sc.next();
            sc.nextLine();
            if (!accounts.get(username).equals(password)) {
                throw new PasswordException("Invalid Password!");
            }

            System.out.println("Logged In!");
                        
        } catch (UsernameException | PasswordException e) {
            e.printStackTrace();
        }
        
    }

    static void createAccount(Scanner sc) {

        try {
            // Read username and check whether it already exists
            System.out.print("Username: ");
            String username = sc.next();
            sc.nextLine();
            if (accounts.containsKey(username)) {
                throw new UsernameException("Username already exists!");
            }
            // Read and validate password
            System.out.print("Password: ");
            String password = sc.next();
            sc.nextLine();
            if (password.length() < 4) {
                throw new PasswordException("Password is too weak!");
            }

            accounts.put(username, password);
            System.out.println("Account Added! Please log in!");
                        
        } catch (UsernameException | PasswordException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        
        System.out.println("Welcome! Please create an account or login to your existing account:");
        // ? "try-with-resources": A try statement that declares one or more resources.
        // ? A resource is an object that must be closed after the program is finished using it.
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter 1 for logging in, 2 for creating an account, or 0 to exit: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        System.out.println("Bye bye!");
                        return;
                    case 1:
                        login(sc);
                        break;
                    case 2:
                        createAccount(sc);
                        break;
                    default:
                        break;
                }
            }
        }

    }


}

class PasswordException extends Exception {

    PasswordException(String message) {

        super(message);

    }

}

class UsernameException extends Exception {

    UsernameException(String message) {

        super(message);

    }  

}
