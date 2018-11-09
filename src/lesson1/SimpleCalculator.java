package lesson1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            int operand1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int operand2 = sc.nextInt();
            System.out.print("Enter operation: ");
            String operation = sc.next();
            int result = 0;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                case "%":
                    result = operand1 % operand2;
                    break;
                default:
                    System.out.println("Unknown operation");
                    continue;
            }
            System.out.println("a " + operation + " b = " + result);

            System.out.println("Again? y/n");
            String answer = sc.next();
            if (answer.equals("n")) {
                break;
            }
        }
    }
}
