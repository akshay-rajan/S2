// 3. Write a user defined exception class to authenticate the user name and password.

import java.util.Scanner;

public class Authentication {
    
    public static void main(String[] args) {
        
        try {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = sc.next();
            sc.nextLine();
            
            if (!username.equals("username")) throw new InvalidUsernameException();
            
            System.out.print("Enter password: ");
            String password = sc.next();
            sc.nextLine();
            sc.close();
            
            if (!password.equals("password")) throw new InvalidPasswordException();
            
            System.out.println("Logged In!");

        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
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


