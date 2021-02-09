import java.util.Scanner;

public class Task3 {
    static public void task3() {
        System.out.println("Task 3");
        System.out.println("The user enters the values of two variables. The program implements the basic mathematical operations on these variables (+ - * / %).");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter operation: ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by 0");
                } else {
                    System.out.println(a / b);
                    break;
                }
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
