import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char op;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? num1 / num2 : 0; break;
            default: System.out.println("Invalid operator!");
        }

        System.out.println("Result: " + result);
    }
}
