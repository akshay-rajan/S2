// 3. Write a user defined exception class to authenticate the user name and password.

import java.util.Scanner;

public class Authentication {

    // Actual username and password of the user
    static final String USERNAME = "username";
    static final String PASSWORD = "password";
    
    public static void main(String[] args) {
        
        try {

            // Read Username
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = sc.next();
            sc.nextLine();
            
            // Validate Username
            if (!username.equals(USERNAME)) {
                sc.close();
                throw new InvalidUsernameException();
            } 
            
            // Read Password
            System.out.print("Enter password: ");
            String password = sc.next();
            sc.nextLine();
            sc.close();

            // Validate Password
            if (!password.equals(PASSWORD)) throw new InvalidPasswordException();
            
            System.out.println("Logged In!");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            // Mulitcatch: Catching multiple exceptions in a single catch block
            e.printStackTrace();
        } catch (Exception e) {
            return;
        }
    }

}

class InvalidUsernameException extends RuntimeException {

    InvalidUsernameException() {

        super("Invalid Username!"); 

    }

}

class InvalidPasswordException extends  RuntimeException {

    InvalidPasswordException() {

        super("Invalid Password!");

    }

}


