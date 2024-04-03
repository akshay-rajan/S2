import java.util.Scanner;

public class Authentication {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.next();
        sc.nextLine();
        
        System.out.print( "Enter your password: " );
        String password = sc.next();
        sc.nextLine();


        // Exception Handling
        try {
            authenticate(username, password);
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        }
        sc.close();
    }

    static void authenticate(String username, String password) {
        if (username.equals("username") && password.equals("password")) {
            System.out.println( "You are logged in!" );
        } else if (username.equals("username")){
            throw new InvalidPasswordException();
        } else {
            throw new InvalidUsernameException();
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


