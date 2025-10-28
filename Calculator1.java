import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;
        double result;

        System.out.println("=== Simple Calculator ===");

        while (true) {
            System.out.print("\nEnter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /) or 'x' to exit: ");
            operator = sc.next().charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Exiting Calculator");
                break;
            }

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    if (num2 == 0)
                        System.out.println("Error: Division by zero!");
                    else {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        }

        sc.close();
    }
}
