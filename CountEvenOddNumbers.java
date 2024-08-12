import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        int even_count = 0, odd_count = 0;
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array_size; i++) {
            array[i] = input.nextInt();
            if (array[i] % 2 == 0)
                even_count++;
            else
                odd_count++;
        }
        System.out.println("Even numbers count: " + even_count);
        System.out.println("Odd numbers count: " + odd_count);
    }
}
