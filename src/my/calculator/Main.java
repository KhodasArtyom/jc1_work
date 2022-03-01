package my.calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please, enter the number: ");
            Scanner s = new Scanner(System.in);
            int firstNumber = s.nextInt();
            System.out.println("Enter operation: ");
            String operation = s.next();

            System.out.println("Enter the second number: ");
            int secondNumber = s.nextInt();

            BasicCalculator basicCalculator = new BasicCalculator();

            final double result = basicCalculator.calculate(firstNumber, secondNumber, operation.charAt(0));
            System.out.println("Result of " + firstNumber + operation.charAt(0)
                    + secondNumber + " is " + result);
            System.out.print("Please enter  [E] to exit or any key to continue");
            String command = s.next();
            if(command.equalsIgnoreCase("E")) {
                System.exit(0);
            }
        }
    }
}
