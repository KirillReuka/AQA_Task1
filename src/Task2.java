import java.util.Scanner;

public class Task2 {
    static public void task2() {
        Scanner scanner = new Scanner(System.in);

        //The user enters the number of lines, then the values of these lines. The program calculates the average length of lines and displays on the screen.
        int n = scanner.nextInt();
        int len = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            len += s.length();
        }
        System.out.println(len/n);
    }
}
