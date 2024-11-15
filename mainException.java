import java.util.Scanner;

class customException extends Exception{
    public customException(String message) {
        super(message);
    }
}
public class mainException {
    public static void checkSingleDigit(int number) throws customException {
        if (number < -9 || number > 9) {
            throw new customException("Exception: The number has more than one digit.");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter single digit number: ");
        int number = in.nextInt();
        try {
            checkSingleDigit(number);
            System.out.println("The number is a single digit.");
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}
