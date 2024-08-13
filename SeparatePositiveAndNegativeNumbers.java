import java.util.Arrays;
import java.util.Scanner;

public class SeparatePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        int positive_count = 0, negative_count = 0;
        for (int i = 0; i < array_size; i++) {
            array[i] = input.nextInt();
            if (array[i] > 0)
                positive_count++;
            else
                negative_count++;
        }
        int[] positive = new int[positive_count];
        int[] negative = new int[negative_count];
        int p = 0, n = 0;
        for (int i = 0; i < array_size; i++) {
            if (array[i] > 0)
                positive[p++] = array[i];
            else
                negative[n++] = array[i];
        }

        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
    }
}
