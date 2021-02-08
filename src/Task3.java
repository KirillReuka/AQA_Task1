import java.util.Scanner;

public class Task3 {
    static public void task3() {
        Scanner scanner = new Scanner(System.in);
        //The user enters the values of two variables. The program implements the basic mathematical operations on these variables (+ - * / %).
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
