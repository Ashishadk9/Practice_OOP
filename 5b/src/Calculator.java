import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number:");
            int num1 =scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 =scanner.nextInt();
            int result = num1/num2;
            System.out.println("Result:"+result);
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero.Please try again");
        }catch (Exception e){
            System.out.println("Error:Invalid input.");
        } finally {
            System.out.println("Calculation finished");
        }
    }
}
