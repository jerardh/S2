
import java.util.Scanner;

class InvalidNameException extends RuntimeException {

    public InvalidNameException(String mess) {
        super(mess);
    }

}

class InvalidPasswordException extends RuntimeException {

    public InvalidPasswordException(String mess) {
        super(mess);
    }

}

class CustomExceptionDemo {

    public static void main(String[] args) {
        String username, passWord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User name:");
        username = scanner.next();
        System.out.println("Enter Password");
        passWord = scanner.next();
        try {
            if (!username.equals("admin")) {
                throw new InvalidNameException("Invalid User name");
            }
            if (!passWord.equals("admin")) {
                throw new InvalidPasswordException("Inavlid password");
            }
        } catch (InvalidNameException e) {
            System.out.println("Run Time Error " + e.getMessage());

        } catch (InvalidPasswordException e) {
            System.out.println("Run Time Error " + e.getMessage());
        } finally {
            System.out.println("End of  Program");
        }

    }
}
