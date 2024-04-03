import java.util.Scanner;

public class Authentication {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.next();
        
        System.out.print( "Enter your password:" );
        String password = sc.next();

        // Exception Handling
        try {
            authenticate(username, password);
        } catch (InvalidUsernameException e) {
            e.printStackTrace();
            System.out.println(username);
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
            System.out.println(password);
        }
        sc.close();
    }

    static void authenticate(String username, String password) {
        if (username != "username") {
            throw new InvalidUsernameException();
        } else if (password != "password"){
            throw new InvalidPasswordException();
        } else {
            System.out.println( "You are logged in!" );
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


