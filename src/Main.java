import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        Fill the array with data (random). Print out. Replace all negative values with 0. Print.
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + random.nextInt(10 + 10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

//        The user enters the number of lines, then the values of these lines. The program calculates the average length of lines and displays on the screen.
        int n = scanner.nextInt();
        int len = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            len += s.length();
        }
        System.out.println(len/n);
//        The user enters the values of two variables. The program implements the basic mathematical operations on these variables (+ - * / %).
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
