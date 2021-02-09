import java.util.Random;
import java.util.Arrays;


public class Task1 {
    public static void task1() {
        System.out.println("Task 1");
        System.out.println("Fill the array with data (random). Print out. Replace all negative values with 0. Print.");
        Random random = new Random();
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
    }
}
