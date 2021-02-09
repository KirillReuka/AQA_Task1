package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    static public void task2() {
        System.out.println("Task 2");
        System.out.println("The user enters the number of lines, then the values of these lines. The program calculates the average length of lines and displays on the screen.");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number of lines: ");
            int n = scanner.nextInt();
            int len = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter line: ");
                String s = scanner.next();
                len += s.length();
            }
            System.out.println(len/n);
        } catch (InputMismatchException er) {
            System.out.println("Input error");
        }
    }
}
